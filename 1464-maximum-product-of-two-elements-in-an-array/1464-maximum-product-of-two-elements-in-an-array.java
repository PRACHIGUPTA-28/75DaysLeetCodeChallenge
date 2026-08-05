class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()) ;
        for(int i:nums) pq.add(i) ;
        int a = (pq.poll()-1)*(pq.poll()-1) ;
        return a ;
    }
}