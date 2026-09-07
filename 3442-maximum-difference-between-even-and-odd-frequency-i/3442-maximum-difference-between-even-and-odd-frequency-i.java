class Solution {
    public int maxDifference(String s) {
        int max = 0 ;
        int min = Integer.MAX_VALUE ;
        Map<Character,Integer> map = new HashMap<>() ;
        for(char c:s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) +1) ;
        }
        for(int i:map.values()){
            if(i%2 == 0) min = Math.min(min, i) ;
            else max = Math.max(max, i) ;
        }
        return max-min ;
    }
}