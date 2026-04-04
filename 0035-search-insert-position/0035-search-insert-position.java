class Solution {
    public int searchInsert(int[] nums, int target){
        // if found
        for( int i = 0 ; i < nums.length ; i++){
            if( nums[i] == target ) return i ; 
        }

        // insert at first
        if( nums[0] > target) return 0 ; 

        // at last
        if( nums[ nums.length-1] < target ) return nums.length ; 
        
        // in between
        for( int i = 0 ; i < nums.length-1 ; i++){
            if( nums[i] < target && nums[i+1] > target) return i+1 ;
        }
            return -1 ;     
    }
}