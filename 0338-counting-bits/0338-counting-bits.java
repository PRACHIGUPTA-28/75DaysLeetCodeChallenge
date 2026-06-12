class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1] ;
        arr[0] = 0 ;
        if(n==0) return arr ;
        arr[1] = 1 ;
        for(int i=2; i<=n; i++){
            arr[i] = arr[i>>1] + (i&1) ;
        }
        return arr ;
    }
}