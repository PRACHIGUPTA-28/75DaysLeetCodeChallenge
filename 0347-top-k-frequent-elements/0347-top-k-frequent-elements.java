class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer , Integer> freq = new HashMap<>() ; 
        for( int i : nums){
            freq.put( i , freq.getOrDefault( i , 0 ) + 1 ) ; 
        }
        PriorityQueue<Integer> minheap = new PriorityQueue<>( (a,b) -> freq.get(a) - freq.get(b) );
        for( int i : freq.keySet() ){
            minheap.add( i ) ; 
            if( minheap.size() > k ){ minheap.poll() ; }
        }
        int ans[] = new int[k] ; 
        int i = 0; 
        while( !minheap.isEmpty()){
            ans[i++] = minheap.poll() ; 
        }
        return ans ; 
    }
}