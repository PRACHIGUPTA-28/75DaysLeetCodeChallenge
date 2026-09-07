class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int x = 0 ;
        for(int i:nums){
            if(i % 2 == 0) x |= i ;
        }
        return x ;
    }
}