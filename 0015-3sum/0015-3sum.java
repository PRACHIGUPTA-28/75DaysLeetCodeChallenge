class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       Set<List<Integer>> uniq = new HashSet<>() ;
        List<List<Integer>> ans = new ArrayList<>() ; 
        for( int i = 0 ; i < nums.length ; i++){
            int target = -1*nums[i] ;
            Set<Integer> set = new HashSet<>() ;

            for( int j = i+1 ; j < nums.length ; j++){
                int third = target - nums[j] ; 

            if( set.contains(third)){
                List<Integer> list = new ArrayList<>() ;
                list.add(nums[i]) ; 
                list.add( nums[j]) ;
                list.add(third) ; 

                Collections.sort(list) ;

                if( !uniq.contains(list)){
                    ans.add(list) ;
                    uniq.add(list) ;
                }
            }
            set.add(nums[j]) ;
            }
        }
        return ans ;
    }
}