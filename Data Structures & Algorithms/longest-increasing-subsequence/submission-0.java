class Solution {
    public int lengthOfLIS(int[] nums) {
        int n= nums.length;
        int[][] dp = new int[n+1][n+1];
        for(int i =0;i<n+1;i++){
            Arrays.fill(dp[i],-1);
        }

        return solve(-1,0,nums,dp);
    }

    public int solve(int prev, int i, int[]nums,int[][] dp){
         
        if(i>= nums.length) return 0;

        if(dp[i][prev+1] != -1){
            return dp[i][prev+1];
        }

        int take  =0;
        if(prev == -1 || nums[i]> nums[prev]){
             take = 1+solve(i,i+1,nums,dp);
        }

        int skip = solve(prev,i+1,nums,dp);

        return dp[i][prev+1] = Math.max(take,skip);

    }
}
