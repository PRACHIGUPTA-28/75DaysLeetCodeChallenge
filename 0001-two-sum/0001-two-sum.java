class Solution {
    public int[] twoSum(int[] nums, int target) {
        int t = target ; 
        for( int j = 0 ; j < nums.length-1 ; j++){
            for( int i = j+1 ; i < nums.length ; i++){
                if( nums[i] + nums[j] == t){
                   return new int[]{j,i} ; 
                }
            }
        }
        return new int[]{-1,-1} ;
    }
}