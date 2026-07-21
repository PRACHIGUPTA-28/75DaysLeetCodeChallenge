class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int a = nums[nums.length/2] ;
        int i = nums.length/2-1 ;
        int j = nums.length/2+1 ;
        while(i>=0 && j<nums.length){
            if(nums[i]==a) return false ;
            else if(nums[j]==a) return false ;
            else{
                i-- ;
                j++ ;
            }
        }
        return true ;
    }
}