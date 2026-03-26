class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxx = Integer.MIN_VALUE ;
        int sum = 0  ;
        for( int i = 0 ; i < k ; i ++){
            sum += nums[i] ; 
        }
        maxx  =Math.max( sum , maxx ) ;
        for( int i = k ; i <nums.length ; i++){
            sum += nums[i] - nums[i-k] ; 
            maxx = Math.max( maxx , sum ) ; 
        }
        return(double) maxx/k ; 

    }
}