class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> map = new HashMap<>() ;
        int maxx = 0 ; 
        int i = 0 ; 
        for(int j = i ; j<fruits.length ; j++){
            map.put( fruits[j], map.getOrDefault(fruits[j], 0) +1 ) ;
            while( map.size() > 2){
                map.put( fruits[i], map.get(fruits[i])-1 ) ;
                if( map.get(fruits[i]) == 0) map.remove(fruits[i]) ;
                i++ ;
            }
            maxx = Math.max( maxx, j-i+1) ;
        }
        return maxx ;
    }
}