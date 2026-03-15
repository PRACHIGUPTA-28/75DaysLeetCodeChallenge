class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
      //  Set<Integer> set = new HashSet<>() ; 
        int freq[] = new int[nums.length] ;
            for( int  i = 0 ; i < nums.length ; i ++ ){
                freq[ nums[i] - 1 ]++ ; 
            }
            ArrayList<Integer> arr = new ArrayList<>() ;
            for( int i = 0 ; i < freq.length ; i ++){
                if( freq[i] == 0 ){ arr.add( i+1 ) ; }
            }
          return arr  ; 
    }
}