class Solution {
    public int characterReplacement(String s, int k) {
        int maxlen = Integer.MIN_VALUE  ;
        int i = 0 ;
        int j = 0 ; 
        int max_freq = 0 ; 
        Map<Character , Integer> map = new HashMap<>() ; 
        while( j < s.length()){
            char c = s.charAt(j) ;
            map.put( c , map.getOrDefault( c , 0 )+1) ;
            max_freq = Math.max( max_freq , map.get(c)) ;
            if( (j-i+1) - max_freq > k ){
                char left = s.charAt(i) ;
                map.put(left , map.get( left) - 1 ) ; 
                i++ ; 
            }
            maxlen = Math.max( maxlen , j-i+1) ; 
            j++ ;
        }
        return maxlen == Integer.MIN_VALUE? 0 : maxlen ;
    }
}