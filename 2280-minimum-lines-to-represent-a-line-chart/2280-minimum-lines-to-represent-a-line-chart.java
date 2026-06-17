class Solution {
    public int minimumLines(int[][] s) {
        Arrays.sort(s, (a,b)->Integer.compare(a[0], b[0])) ;
        if(s.length==1) return 0 ;
        int bP = 0 ;
        for(int i=1; i<s.length-1; i++){
            long a1 = s[i][0] ;
            long a2 = s[i][1] ;

            long b1 = s[i+1][0] ;
            long b2 = s[i+1][1] ;

            long c1 = s[i-1][0] ;
            long c2 = s[i-1][1] ;

           if((a1-b1)*(a2-c2) != (a1-c1)*(a2-b2)) bP ++ ;
        }
        return bP+1 ;
    }
}