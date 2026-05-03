class Solution {
    public int[] sortedSquares(int[] nums) {
      PriorityQueue<Integer> min = new PriorityQueue<>() ;
        for(int i = 0 ; i  <nums.length ; i++){
            min.add(nums[i]*nums[i]) ;
        }
        for(int i = 0; i <nums.length ; i++){
            nums[i] = min.poll() ;
        }
        return nums ;
    }
}