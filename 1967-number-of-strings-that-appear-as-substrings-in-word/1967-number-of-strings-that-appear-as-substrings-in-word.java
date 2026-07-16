class Solution {
    public int numOfStrings(String[] patterns, String word) {
       int n = 0 ;
       for(String s:patterns){
        if(word.indexOf(s) != -1) n++ ;
       }
       return n ;
    }
}