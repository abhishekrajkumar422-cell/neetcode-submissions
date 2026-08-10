class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);

        return solve(n-1,nums,dp);
    }

    public int solve(int n,int[] nums, int[] dp){

        if(n==0) return nums[0];
        if(n<0) return 0;

        if(dp[n] != -1 ) return dp[n];

        int pick = nums[n]  + solve(n-2,nums,dp);
        int notpick = solve(n-1,nums,dp);

        dp[n] = Math.max(pick,notpick);

        return dp[n];
    }
}
