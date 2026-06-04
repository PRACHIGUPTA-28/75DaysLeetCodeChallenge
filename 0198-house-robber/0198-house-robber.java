class Solution {
    int[] dp ;
    public int rob(int[] nums) {
        dp = new int[nums.length] ;
        Arrays.fill(dp, -1) ;
        return fn(nums, 0) ;
    }
    public int fn(int[] nums, int i){
        if(i<0 || i>= nums.length) return 0 ;
        if(dp[i] != -1) return dp[i] ;
        dp[i] = Math.max( nums[i] + fn(nums, i+2) , fn(nums, i+1)) ;
        return dp[i] ;
    }
}