class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -2);

        int ans = solve(coins, amount, dp);

        return ans;
    }

    public int solve(int[] coins, int amount, int[] dp) {
        if (amount == 0) return 0;
        if (amount < 0) return -1;

        if (dp[amount] != -2) {
            return dp[amount];
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < coins.length; i++) {

            int coin = coins[i];

            int result = solve(coins, amount - coin, dp);

            if (result != -1) {

                min = Math.min(min, result + 1);
            }
        }

        if (min == Integer.MAX_VALUE) {
            dp[amount] = -1;
        } else {
            dp[amount] = min;
        }

        return dp[amount];
    }
}
