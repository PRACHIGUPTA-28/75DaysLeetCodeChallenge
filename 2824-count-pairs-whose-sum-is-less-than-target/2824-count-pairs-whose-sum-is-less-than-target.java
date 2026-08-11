class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int k = 0 ;
        for(int i=0; i<nums.size()-1; i++){
            for(int j=i+1; j<nums.size(); j++){
                if(nums.get(i)+nums.get(j) < target) k++ ;
            }
        }
        return k ;
    }
}