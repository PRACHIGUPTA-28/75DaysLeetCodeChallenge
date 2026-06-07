class Solution {
    int[] dp ;
    public int coinChange(int[] coins, int amount) {
        if(amount==0) return 0 ;
        if(coins.length==1) return amount%coins[0]==0 ? amount/coins[0] : -1 ;
        dp = new int[amount+1] ;
        Arrays.fill(dp, -1) ;
       int min = fn(coins, amount) ;
        return min==Integer.MAX_VALUE?-1:min ;
    }
    public int fn(int[] coins, int amt){
        if(amt == 0) return 0 ;
        if(amt <0) return Integer.MAX_VALUE ;
        if(dp[amt] != -1) return dp[amt] ;
        int min =Integer.MAX_VALUE ;
        for(int coin:coins){
                int n = fn(coins, amt-coin) ;
                if(n != Integer.MAX_VALUE) min = Math.min(min, n+1) ;
            }
            dp[amt] = min ;
            return min ;
    }
}