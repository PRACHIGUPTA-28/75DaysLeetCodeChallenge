class Solution {
    public int[] transformArray(int[] nums) {
        int o = 0 ;
        int e = 0 ;
        for(int i: nums){
            if(i%2 == 0) e++ ;
            else o++ ;
        }
        int i = 0 ;
        while(e-->0) nums[i++] = 0 ;
        while(o-->0) nums[i++] = 1 ;
        return nums ;
    }
}