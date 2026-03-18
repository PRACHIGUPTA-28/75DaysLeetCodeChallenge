class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length] ; 
        int prod = 1 ; 
        int zeroes = 0 ; 
           for( int i = 0 ; i < nums.length ; i++ ){
                  if( nums[i] != 0 ){
            prod *= nums[i] ; 
                }
                if( nums[i] == 0 ){ zeroes ++ ; }
           }
        for( int i = 0 ; i < nums.length ; i ++){
             if( zeroes == 1 ){
                if( nums[i] != 0 ){ arr[i] = 0 ; }
                else{ arr[i] = prod  ; }
             }
             else if( zeroes > 1 ){ arr[i] = 0 ; }
             else{ arr[i] = prod / nums[i] ; }
        }   
        return arr ;
    }
}