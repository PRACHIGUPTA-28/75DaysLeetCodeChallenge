class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor ==-1) return Integer.MAX_VALUE ;
        long dd = Math.abs((long)dividend) ;
        long dr = Math.abs((long)divisor) ;
        long ans = 0 ;
        for(int i=31; i>=0; i--){
            if((dr<<i) <= dd){
                dd -= dr<<i ;
                ans += 1L<<i ;
            }
        }
        if((long)dividend*divisor < 0) ans = -ans ;
        return (int)ans ;
    }
}