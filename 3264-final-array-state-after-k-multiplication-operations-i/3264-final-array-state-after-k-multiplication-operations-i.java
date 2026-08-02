class Solution {
    public int[] getFinalState(int[] nums, int k, int m) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b)->{
                if(nums[a]==nums[b]) return Integer.compare(a,b) ;
                return Integer.compare(nums[a], nums[b]) ;
            }
        ) ;
        for(int i=0; i<nums.length; i++){
            pq.add(i) ;
        }
        while(k>0){
            int a = pq.poll() ;
            nums[a] *= m ;
            pq.add(a) ;
            k-- ;
        }
        return nums ;
    }
}