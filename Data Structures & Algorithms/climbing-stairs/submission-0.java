class Solution {
    public int climbStairs(int n) {
        
        int ways[] = new int[n+1];

        Arrays.fill(ways, -1);

        return countWay(n,ways);

    }

    public  int countWay(int n, int[] ways){

        if(n==0) return 1;
        if(n<0) return 0;

        if(ways[n] !=-1){
            return ways[n];
        }

        ways[n] = countWay(n-1,ways) + countWay(n-2,ways);

        return ways[n];
    }
}
