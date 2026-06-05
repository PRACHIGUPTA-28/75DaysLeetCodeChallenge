class Solution {
    int dp[] ; 
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0] ;
        dp = new int[nums.length] ;
        Arrays.fill(dp,-1) ;
        int m = fn(nums,0) ;
        Arrays.fill(dp,-1) ;
        int n =  fn1(nums,1) ;
        return Math.max(m,n) ;
    }
    public int fn(int[] nums, int i){
        if(i<0 || i>=nums.length-1) return 0 ;
        
        if(dp[i] != -1) return dp[i] ;

        dp[i] = Math.max(nums[i]+fn(nums, i+2) , fn(nums, i+1)) ;
        return dp[i] ;
    }
    public int fn1(int[] nums, int i){
        if(i<1 || i>nums.length-1) return 0 ;
        
        if(dp[i] != -1) return dp[i] ;

        dp[i] = Math.max(nums[i]+fn1(nums, i+2) , fn1(nums, i+1)) ;
        return dp[i] ;
    }
}