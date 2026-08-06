class Solution {
    public int countLargestGroup(int n) {
        int max = 0 ;
        Map<Integer,Integer> map = new HashMap<>() ;
        for(int i=1; i<=n; i++){
            int sum = 0 ; 
            int x = i ;
            while(x>0){
                sum += x%10 ;
                x /= 10 ;
            }
            map.put(sum, map.getOrDefault(sum,0) + 1) ;
        }
        for(int i:map.keySet()){
           max = Math.max(max, map.get(i)) ;
        }
        int m = 0 ;
        for(int i:map.keySet()){
            if(map.get(i) == max) m++ ;
        }
        return m ;
    }
}