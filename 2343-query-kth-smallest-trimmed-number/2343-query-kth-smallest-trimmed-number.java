class Solution {
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        
        int[] ans = new int[queries.length] ;
        for(int i=0; i<queries.length; i++){
            int trim = queries[i][1] ;
            PriorityQueue<Integer> pq = new PriorityQueue<>(
            (m,n)-> {
                String a = nums[m].substring(nums[m].length()-trim) ;
                String b = nums[n].substring(nums[n].length()-trim) ;
                int c = a.compareTo(b) ;
                if(c==0) return Integer.compare(n,m) ;
                return -c ;
            }
        ) ;
            for(int j=0; j<nums.length; j++){
                pq.add(j) ;
                if(pq.size()>queries[i][0]) pq.poll() ;
            }
            ans[i] = pq.peek() ;
        }
        return ans ;
    }
}