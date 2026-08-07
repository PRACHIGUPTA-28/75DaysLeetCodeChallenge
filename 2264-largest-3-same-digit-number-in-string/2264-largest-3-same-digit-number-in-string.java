class Solution {
    public String largestGoodInteger(String num) {
        int max = -1 ;
        for(int i=num.length()-1; i>1; i--){
            if(num.charAt(i) == num.charAt(i-1) && num.charAt(i) == num.charAt(i-2)){
                max = Math.max(max, num.charAt(i)-'0') ;
            }
        }
        String s = "" ;
        if(max != -1){
            s = String.valueOf(max)+String.valueOf(max)+String.valueOf(max) ;
        }
        return s ;
    }
}