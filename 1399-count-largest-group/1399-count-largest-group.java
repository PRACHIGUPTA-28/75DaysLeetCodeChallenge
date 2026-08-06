class Solution {
    public int countLargestGroup(int n) {
        int max = 0 ;
        int[] f = new int[37] ;
        for(int i=1; i<=n; i++){
            int sum = 0 ; 
            int x = i ;
            while(x>0){
                sum += x%10 ;
                x /= 10 ;
            }
            f[sum]++ ;
        }
        for(int i:f){
           max = Math.max(max, i) ;
        }
        int m = 0 ;
        for(int i:f){
            if(i == max) m++ ;
        }
        return m ;
    }
}