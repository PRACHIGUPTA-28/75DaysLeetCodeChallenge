class Solution {
    public boolean isSumEqual(String f, String s, String t) {
        int a = 0 ;
        int b = 0 ;
        int c = 0 ; 
        for(char ch:f.toCharArray()){
            a = a*10 + (ch-'a') ;
        }
        for(char ch:s.toCharArray()){
            b = b*10 + (ch-'a') ;
        }
        for(char ch:t.toCharArray()){
            c = c*10 + (ch-'a') ;
        }
        return (a+b) == c ;
    }
}