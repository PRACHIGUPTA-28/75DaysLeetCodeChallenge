class Solution {
    public int countHillValley(int[] nums) {
        int prev = nums[0] ;
        int n = 0 ;
        for(int i=1; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]) continue ;
            if(nums[i] > prev && nums[i] > nums[i+1]) n++ ;
            else if(nums[i] < prev && nums[i] < nums[i+1]) n++ ;
            prev = nums[i] ;
        }
        return n ;
    }
}