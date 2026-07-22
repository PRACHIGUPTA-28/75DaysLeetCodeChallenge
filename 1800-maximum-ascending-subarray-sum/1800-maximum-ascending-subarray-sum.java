class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = 0 ;
        int sum = 0 ;
        int i = 0 ;
        for(int j=i; j<nums.length-1; j++){
            if(nums[j+1] > nums[j]) sum += nums[j] ;
            else{
                sum += nums[j] ;
                max = Math.max(max, sum) ;
                sum = 0 ;
                i = j+1 ;
            }
        }
        if(nums[nums.length-1] > nums.length-2) sum += nums[nums.length-1] ;
        max = Math.max(max, sum) ;
        return max ;
    }
}