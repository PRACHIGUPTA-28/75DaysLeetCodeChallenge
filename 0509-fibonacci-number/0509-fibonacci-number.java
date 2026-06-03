class Solution {
    public int fib(int n) {
        return fn(n) ;
    }
    public int fn(int n){
        if(n==0) return 0 ;
        if(n==1) return 1 ;
        int m = fn(n-1) + fn(n-2) ;
        return m ;
    }
}