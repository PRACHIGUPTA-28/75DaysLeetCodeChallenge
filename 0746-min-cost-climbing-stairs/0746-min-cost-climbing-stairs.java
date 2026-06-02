class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length] ;
        dp[0] = cost[0] ;
        dp[1] = cost[1] ;
        for(int i=2; i<cost.length; i++){
            int step1 = dp[i-1] + cost[i] ;
            int step2 = dp[i-2] + cost[i] ;
            dp[i] = Math.min(step1, step2) ;
        }
        return Math.min(dp[dp.length-1], dp[dp.length-2]) ;
    }
}