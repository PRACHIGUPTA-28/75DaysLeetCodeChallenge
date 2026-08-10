class Solution {
    public int kthSmallest(int[][] mat, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()) ;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length; j++){
                pq.add(mat[i][j]) ;
                if(pq.size()>k){
                    pq.poll() ;
                }
            }
        }
        return pq.poll() ;
    }
}