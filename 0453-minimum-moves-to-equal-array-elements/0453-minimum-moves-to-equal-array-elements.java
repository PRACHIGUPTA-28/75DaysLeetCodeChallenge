class Solution {
    public int minMoves(int[] nums) {
        int op = 0 ;
        int min = Integer.MAX_VALUE ;
        for(int i:nums) min = Math.min(min, i) ;
        for(int i:nums) op += Math.abs(i-min) ;
        return op ;
    }
}