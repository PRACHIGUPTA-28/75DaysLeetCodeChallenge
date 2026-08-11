class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
    Map<Float, List<Integer>> map = new HashMap<>() ;
    PriorityQueue<Float> pq = new PriorityQueue<>(Collections.reverseOrder()) ;
    for(int i=arr.length-1; i>0; i--){
        for(int j=0; j<i; j++){
            int a = arr[j] ;
            int b = arr[i] ;
            float val = (float)a/b ;
            map.computeIfAbsent(val, ls->Arrays.asList(a, b)) ;
            pq.add(val) ;
            if(pq.size()>k)pq.poll() ;
        }
    }
        int[] ans = new int[2] ;
        ans[0] = map.get(pq.peek()).get(0) ;
        ans[1] = map.get(pq.peek()).get(1) ;
        return ans ;
    }
}