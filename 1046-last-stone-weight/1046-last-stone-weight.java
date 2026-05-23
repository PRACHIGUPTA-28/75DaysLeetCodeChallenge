class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()) ;
        for(int i: stones) pq.add(i) ;
        while(pq.size() >= 2){
            int x = pq.poll() ;
            int y = pq.poll() ;
            if(x != y){
                pq.add( Math.max(x,y) - Math.min(x,y)) ;
            }
        }
        return pq.size() == 0? 0 : pq.peek() ;
    }
}