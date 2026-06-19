class Solution {
    public int trap(int[] ht) {
        int[] left = new int[ht.length] ;
        int[] right = new int[ht.length] ;
        int lmax = 0 ;
        int rmax = 0 ;
        for(int i=1; i<ht.length; i++){
            if(ht[i-1] > lmax) lmax = ht[i-1] ;
            left[i] = lmax ;
        }
        for(int i=ht.length-2; i>=0; i--){
            if(ht[i+1] > rmax) rmax = ht[i+1] ;
            right[i] = rmax ;
        }
        int[] stored = new int[ht.length] ;
        for(int i=0; i<ht.length; i++){
            int min = Math.min(left[i], right[i]) ;
            if(ht[i] < min) stored[i] = min-ht[i] ;
        }   
        long sum = 0 ;
        for(int i:stored) sum += i ;
        return (int)sum ;
    }
}