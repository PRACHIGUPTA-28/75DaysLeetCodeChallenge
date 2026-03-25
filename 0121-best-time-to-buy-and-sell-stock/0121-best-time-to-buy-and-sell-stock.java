class Solution {
    public int maxProfit(int[] prices) {
        int max  = 0  ;
       int min = Integer.MAX_VALUE  ; 
       // int profit = 0 ;
       for( int i = 0 ; i < prices.length ; i++){
             min = Math.min( prices[i] , min ) ; 
             int profit = prices[i] - min ; 
             max = Math.max( max , profit ) ;  
       }
       return max ; 
    }
}