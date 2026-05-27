class Solution {
    public int findJudge(int n, int[][] trust) {
        boolean[] found = new boolean[n] ;
        int[] freq = new int[n] ;
        for(int i=0; i<trust.length; i++){
            found[trust[i][0]-1] = true ;
            freq[trust[i][1]-1]++ ;
        }
        for(int i=0; i<found.length; i++){
            if(found[i] == false && freq[i] == n-1) return i+1 ;
        }
        return -1 ;
    }
}