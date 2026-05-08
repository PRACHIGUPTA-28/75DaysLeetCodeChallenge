class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length() ;
        Map<Character,Integer> map = new HashMap<>() ;
        for(int i=0 ; i<s1.length() ; i++){
            char ch = s1.charAt(i) ;
            map.put(ch , map.getOrDefault(ch , 0) +1 ) ;
        }
        Map<Character,Integer> map1 = new HashMap<>() ;
        int left = 0  ;
        for(int i = 0 ; i < s2.length() ; i++){
            char ch = s2.charAt(i) ;
            map1.put(ch , map1.getOrDefault(ch , 0) +1 ) ;
            if(i-left+1 > n){
                map1.put( s2.charAt(left) , map1.get(s2.charAt(left))-1 ) ;
                if(map1.get(s2.charAt(left)) == 0) map1.remove(s2.charAt(left)) ;
                left++ ; 
            }
            if(map1.equals(map)) return true ;
        }
        return false ;
    }
}