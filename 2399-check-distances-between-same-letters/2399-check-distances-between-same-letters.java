class Solution {
    public boolean checkDistances(String s, int[] distance) {
        Map<Character,Integer> map = new HashMap<>() ;
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                int a = i-map.get(s.charAt(i))-1 ;
                if(a != distance[s.charAt(i)-'a']) return false ;
            }
            else{
                map.putIfAbsent(s.charAt(i), i) ;
            }
        }
        return true ;
    }
}