class Solution {
    public boolean checkDistances(String s, int[] distance) {
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i) ;
            int a = s.indexOf(c) ;
            int b = s.lastIndexOf(c) ;
            if(b-a-1 != distance[c-'a']) return false ;
        }
        return true ;
    }
}