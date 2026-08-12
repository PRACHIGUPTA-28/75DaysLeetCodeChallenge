class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>() ;
        map.putIfAbsent('I',1) ;
        map.putIfAbsent('V',5) ;
        map.putIfAbsent('X',10) ;
        map.putIfAbsent('L',50) ;
        map.putIfAbsent('C',100) ;
        map.putIfAbsent('D',500) ;
        map.putIfAbsent('M',1000) ;
        int num = 0 ; 
        for(int i=0; i<s.length()-1; i++){
            int m = map.get(s.charAt(i)) ;
            int n = map.get(s.charAt(i+1)) ;
            if(m < n){
                num -= m ;
            }
            else num += m ;
        }
        num += map.get(s.charAt(s.length()-1)) ;
        return num ;
    }
}