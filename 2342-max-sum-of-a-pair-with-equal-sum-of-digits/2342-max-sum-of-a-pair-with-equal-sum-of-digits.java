class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>() ;
        for(int i:nums){
            int sum = sum(i) ;
            if(map.containsKey(sum)){
                map.get(sum).add(i) ;
            }
            else{
                map.put(sum, new PriorityQueue<>(Collections.reverseOrder())) ;
                map.get(sum).add(i) ;
            }
        }
        int max = -1 ;
        for(PriorityQueue<Integer> pq : map.values()){
            if(pq.size()<2) continue ;
            int a = pq.poll() ;
            int b = pq.poll() ;
            max = Math.max(max, a+b) ;
        }
        return max ;
    }
    public int sum(int n){
        int sum = 0 ;
        while(n>0){
            sum += n % 10 ;
            n /= 10 ;
        }
        return sum ;
    }
}