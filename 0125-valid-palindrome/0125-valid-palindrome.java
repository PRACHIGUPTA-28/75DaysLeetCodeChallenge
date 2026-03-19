class Solution {
    public boolean isPalindrome(String s) {
       s = s.toLowerCase() ;
      // s = s.replaceAll( "[A-Z]" , "[a-z]" ) ;
     //  s = s.replaceAll(" ","") ;
       s = s.replaceAll( "[^a-z0-9]" , "") ;
       int st = 0 ; 
       int l = s.length() -1 ;
       while( st<l){
        if( s.charAt(st++) != s.charAt(l--) ){ return false ; }
       }
       return true ; 
    }
}