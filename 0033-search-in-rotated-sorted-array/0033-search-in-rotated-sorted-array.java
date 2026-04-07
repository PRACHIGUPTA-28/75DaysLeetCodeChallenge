class Solution {
    public int search(int[] nums, int target) {
        if( nums.length == 1){
            return nums[0] == target ? 0 : -1 ; 
        }

        int i = 0 ; 
        int j = nums.length-1 ;
        while( i<=j){
            int mid = (i+j)/2 ; 

            if( target == nums[mid]){
                return mid ; 
            }
            if( nums[i] <= nums[mid]){ //left part sorted
                if( target < nums[mid] && target >= nums[i]){
                    j = mid-1 ;
                }
                else{
                    i = mid+1 ; 
                }
            }
            
            else{ //right part sorted
                if( target <= nums[j] && target > nums[mid]){
                    i = mid+1 ; 
                }
                else{
                    j = mid-1 ; 
                }
            }
        }
        return -1 ; 
         
    }
}