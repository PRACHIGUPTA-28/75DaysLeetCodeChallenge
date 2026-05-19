class Solution {
    public String maxValue(String n, int x) {
        if(n.charAt(0) != '-'){
        for(int i=0; i<n.length(); i++){
            int m = n.charAt(i) - '0' ;
            if(m < x){
                if(i>0)
                n = n.substring(0,i) + x + n.substring(i) ;
                else n = x + n.substring(i) ;
                break ;
                }
                if( i == n.length()-1){
                    n = n + x ;
                    break ;
                }
            }
        }
        else{
            for(int i=1; i<n.length(); i++){
            int m = n.charAt(i) - '0' ;
            if(m > x){
                if(i>1)
                n = n.substring(0,i) + x + n.substring(i) ;
                else n = n.substring(0,i) + x + n.substring(i) ;
                break ;
                }
                if( i == n.length()-1){
                    n = n + x ;
                    break ;
                }
            }
            
        }
        return n ;

    }
}