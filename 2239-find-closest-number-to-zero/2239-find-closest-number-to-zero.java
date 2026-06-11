class Solution {
    public int findClosestNumber(int[] nums) {
       int min = Math.abs(nums[0]) ;
       int n = nums[0] ;
       for(int i=1; i<nums.length; i++){
        int m = Math.abs(nums[i]) ;
        if(min > m){
            min = m ;
            n = nums[i] ;
            continue ;
        }
        if(min == m){
            if(nums[i] > n) n = nums[i] ; 
        }
       }
       return n ;
    }
}