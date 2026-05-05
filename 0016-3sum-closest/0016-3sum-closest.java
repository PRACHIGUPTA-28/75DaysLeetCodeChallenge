class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int max = nums[0]+nums[1]+nums[2] ;
        for(int i = 0 ; i < nums.length ;i++){
            for(int j =i+1 ; j<nums.length ;j++){
                for(int k = j+1 ;k<nums.length ;k++){
                    int sum = nums[i]+nums[j]+nums[k] ;
                    int s = Math.abs(target-sum) ;
                    if( s <= Math.abs(target-max)) max = sum ;
                }
            }
        }
        return max ;
    }
}