class Solution {
    public boolean containsDuplicate(int[] nums) {
        // int count = 0 ; 
        Arrays.sort(nums) ;
        for( int i = 0 ; i < nums.length-1 ; i ++){
            //for( int j = 0 ; j != i && j < nums.length  ; j++){
                if( nums[i] == nums[i+1]){ 
                    return true ; 
                }
            }
        
        return false ; 
    }
}