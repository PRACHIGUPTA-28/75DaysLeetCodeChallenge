class Solution {
    public boolean checkTwoChessboards(String c1, String c2) {
        String s1 = "aceg" ;//black at odd
        int col1 = 0 ;//0=white 1 == black 
        int col2 = 0 ;
        if(s1.contains(String.valueOf(c1.charAt(0)))){
            if((c1.charAt(1)-'0') % 2 == 0) col1 = 0 ;
            else col1 = 1 ;
        }
        else{
             if((c1.charAt(1)-'0') % 2 == 0) col1 = 1 ;
            else col1 = 0 ;
        }
        if(s1.contains(String.valueOf(c2.charAt(0)))){
            if((c2.charAt(1)-'0') % 2 == 0) col2 = 0 ;
            else col2 = 1 ;
        }
        else{
             if((c2.charAt(1)-'0') % 2 == 0) col2 = 1 ;
            else col2 = 0 ;
        }
        return col1 == col2 ;
    }
}