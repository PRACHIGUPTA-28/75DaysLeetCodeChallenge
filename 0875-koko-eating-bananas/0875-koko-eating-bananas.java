class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1 ; //minimum limit
        int high = 0 ; //max
        for(int i:piles) high = Math.max(high, i) ;

        while(low < high){
            int mid = (high-low)/2 + low ;
            int hr = 0 ;

            for(int i:piles) hr += Math.ceil((double)i/mid) ;

            if(hr <= h) high = mid ;
            else low = mid+1 ;
        }
        return low ;
    }
}