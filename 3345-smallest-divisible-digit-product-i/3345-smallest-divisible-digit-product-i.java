class Solution {
    public int smallestNumber(int n, int t) {
        if(n==0) return n ;
        while(true){
            if(prod(n)%t==0) return n ;
            n++ ;
        }
    }
    int prod(int n){
        int pro = 1 ;
        while(n>0){
            pro *= n%10 ;
            n /= 10 ;
        }
        return pro ;
    }
}