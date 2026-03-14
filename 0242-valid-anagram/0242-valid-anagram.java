class Solution {
    public boolean isAnagram(String s, String t) {
        char[] st = s.toCharArray() ; 
        if( s.length() != t.length()){ return false ; }
        char[] ts = t.toCharArray()  ;
        Arrays.sort(ts) ; 
        Arrays.sort(st) ; 
        for( int i = 0 ; i < ts.length ; i++){
            if( ts[i] != st[i]){ return false ; }
        }
        return true ; 
    }
}