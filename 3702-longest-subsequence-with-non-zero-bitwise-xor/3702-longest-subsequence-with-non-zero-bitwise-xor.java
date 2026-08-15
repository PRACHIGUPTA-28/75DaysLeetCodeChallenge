class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0 ;
        boolean isNonzero = false ;
        for(int i: nums){
            xor ^= i ;
            if(isNonzero == true) continue ;
            if(i != 0) isNonzero = true ;
        }
        if(xor != 0) return nums.length ;
        if(isNonzero == false) return 0 ;
        return nums.length - 1 ;
    }
}