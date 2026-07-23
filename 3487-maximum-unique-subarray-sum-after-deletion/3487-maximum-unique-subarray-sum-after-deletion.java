class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> set = new HashSet<>() ;
        int max = Integer.MIN_VALUE ;
        int sum = 0 ;
        for(int i=0; i<nums.length; i++){
            max = Math.max(max, nums[i]) ;
            if(!set.contains(nums[i]) && nums[i] > 0){
                sum += nums[i] ;
                set.add(nums[i]) ;
            }
        }
        return sum>0 ? sum : max ;
    }
}