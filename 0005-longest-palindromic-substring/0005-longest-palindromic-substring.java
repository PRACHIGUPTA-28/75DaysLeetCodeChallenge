class Solution {
    int max = 0 ;
    int idx = 0 ;
    public String longestPalindrome(String s) {
        if(s.length()<=1) return s ;
        for(int i=0; i<s.length(); i++){
            fn(s, i, i) ; 

            if(i<s.length()-1)
            fn(s, i, i+1) ;
        }
        return s.substring(idx, idx+max) ;
    }
    public void fn(String s, int i, int j){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i-- ;
            j++ ;
        }
        int length = j-i-1 ;
        if(length >= max){
            max = length ;
            idx = i+1 ;
        }
    }
}