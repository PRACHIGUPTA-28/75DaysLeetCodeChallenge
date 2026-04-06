class Solution {
    public int findMin(int[] nums) {

      //  for( int i = 0 ; i < nums.length-1 ; i ++){
     //    if( nums[i] > nums[i+1])
     //  return nums[i+1] ; 
    // }
    //   return nums[0] ; 

    int i =0  ; 
    int j = nums.length-1 ;
    while( i < j ){
        int mid = (i+j)/2 ;

            if( nums[mid] > nums[j] ){
                i = mid+1 ; 
            }
            else{
                j = mid ;
            }
    }
        return nums[i] ; 
    }
}