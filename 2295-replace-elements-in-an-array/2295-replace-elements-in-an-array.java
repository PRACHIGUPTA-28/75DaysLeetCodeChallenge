class Solution {
    public int[] arrayChange(int[] nums, int[][] op) {
        Map<Integer,Integer> map = new LinkedHashMap<>() ;
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i) ;
        }
        for(int i=0; i<op.length; i++){
            int idx = map.get(op[i][0]) ;
            nums[idx] = op[i][1] ;
            map.put(nums[idx], idx) ;
            map.remove(op[i][0]) ;
        }
        return nums ;
    }
}