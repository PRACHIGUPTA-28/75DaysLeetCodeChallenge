class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxx = 0 ; 
        int idx = 0 ; 
        while( idx < s.length() ){
            int count = 0 ; 
            ArrayList<Character> arr = new ArrayList<>() ; 
            for( int j = idx ; j < s.length() ; j++){
                if( arr.contains( s.charAt(j))){ break ; }
                else{
                    arr.add( s.charAt(j)) ; 
                    count++ ; 
                }
            }
            idx++ ; 
            maxx = Math.max( maxx , count ) ; 
            
        }
        return maxx ; 
    }
}