class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>() ;
        for(char c:s.toCharArray()) map.put(c, map.getOrDefault(c,0)+1) ;
        int n = map.get(s.charAt(0)) ;
        for(int i:map.values()){
            if(i != n) return false ;
        }
        return true ;
    }
}