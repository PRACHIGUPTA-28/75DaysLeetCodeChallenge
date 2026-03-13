class Solution {
    public int[] minOperations(String boxes) {
        int ans[] = new int[ boxes.length()] ;
        int idx = 0 ; 
        while(  idx < boxes.length() ){
            int sum = 0 ; 
        for( int i = 0 ; i < boxes.length() ; i ++ ){
            //int sum = 0 ;
            if( i!=idx &&  boxes.charAt(i) == '1' ){ sum += Math.abs( idx - i ) ; }
            }
            ans[idx] = sum ; 
            idx ++ ; 
        }
        return ans ;
    }
}
