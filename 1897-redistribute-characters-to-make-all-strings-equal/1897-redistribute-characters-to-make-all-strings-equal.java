class Solution {
    public boolean makeEqual(String[] words) {
        Map<Character,Integer> map = new HashMap<>() ;
        for(String s:words){
            for(char c:s.toCharArray()){
                map.put(c, map.getOrDefault(c,0) +1) ;
            }
        }
        int n = words.length ;
        for(int i:map.values()){
            if(i % n != 0) return false ;
        }
        return true ;
    }
}