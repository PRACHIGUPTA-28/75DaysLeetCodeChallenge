class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>() ;
        for( int n : nums) set.add(n) ;

        int count = 0 ;
        int maxx = 0 ;
        for( int i : set){
            if( !set.contains(i-1)){
                count = 1 ;// for i
            while( set.contains(i+1)){
                count++ ;
                i++ ;
                }
            }
            maxx = Math.max(maxx , count) ;
        }
        return maxx ;
    }
}