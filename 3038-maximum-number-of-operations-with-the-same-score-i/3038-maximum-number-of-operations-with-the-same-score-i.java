class Solution {
    public int maxOperations(int[] nums) {
        int sum = nums[0] + nums[1] ;
        int op = 1 ;
        for(int i=2; i<nums.length-1; i+=2){
            if(nums[i] + nums[i+1] == sum) op++ ;
            else break ;
        }
        return op ;
    }
}