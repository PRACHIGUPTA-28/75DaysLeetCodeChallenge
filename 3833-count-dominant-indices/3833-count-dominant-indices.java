class Solution {
    public int dominantIndices(int[] nums) {
        int sum = nums[nums.length-1] ;
        int idx = 0 ;
        for(int i = nums.length-2; i>=0; i--){
            int n = nums.length-1-i ;
            if(nums[i] > sum/n) idx++ ;
            sum += nums[i] ;
        }
        return idx ;
    }
}