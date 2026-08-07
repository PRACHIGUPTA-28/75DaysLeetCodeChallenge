class Solution {
    public String largestOddNumber(String num) {
        if((num.charAt(num.length()-1)-'0') % 2 != 0) return num ;
        String s = "" ;
        for(int i = num.length()-2; i>=0; i--){
            int m =  num.charAt(i)-'0' ;
            if(m%2 != 0 ){
                num = num.substring(0,i+1) ;
                return num ;
            }
        }
        return s ;
    }
}