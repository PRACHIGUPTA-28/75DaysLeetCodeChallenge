class Solution {
    public int countSegments(String s) {
        if(s.length()==0) return 0 ;
        int n = 0 ; 
        StringBuilder sb = new StringBuilder() ;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != ' '){
                sb.append(s.charAt(i)) ;
            }    
            if(s.charAt(i) == ' '){
                if(sb.length() != 0){
                    n++ ;
                    sb.setLength(0) ;
                }
            }
        }
        return sb.length()==0 ? n : n+1 ;
    }
}