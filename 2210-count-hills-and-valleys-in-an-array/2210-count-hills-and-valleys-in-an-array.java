class Solution {
    public int countHillValley(int[] nums) {
        int[] left = new int[nums.length];
        left[0] = -1 ;
        left[nums.length-1] = -1 ;
        for(int i=1; i<nums.length; i++){
            if(nums[i] > nums[i-1]) left[i] = 0 ;
            else if(nums[i] < nums[i-1]) left[i] = 1 ;
            else left[i] = left[i-1] ;
        }
        int[] right = new int[nums.length];
        right[0] = -1 ;
        right[nums.length-1] = -1 ;
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i] > nums[i+1]) right[i] = 0 ;
            else if(nums[i] < nums[i+1]) right[i] = 1 ;
            else right[i] = right[i+1] ;
        }
        int n = 0 ;
        for(int i=1; i<nums.length-1; i++){
            if(left[i] == -1 || right[i] == -1) continue ;
            if(left[i] == right[i]){
                if(nums[i] != nums[i-1]) n++ ;
            }
        }
        return n ;
    }
}