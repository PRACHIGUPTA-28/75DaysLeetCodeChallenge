class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int n = 0 ;
        for(int i:arr1){
            boolean is = true ;
            for(int j:arr2){
                if(Math.abs(i-j) <= d){
                    is = false ;
                    break ;
                }
            }
            if(is==true) n++ ;
        }
        return n ;
    }
}