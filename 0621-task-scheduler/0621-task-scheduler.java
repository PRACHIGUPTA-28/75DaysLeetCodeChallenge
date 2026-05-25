class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] arr = new int[26] ;
        for(int i=0; i<tasks.length; i++){
            arr[tasks[i] - 'A']++ ;
        }
        int max = 0 ;
        for(int i:arr) max = Math.max(max, i) ;
        
        int count = 0; 
        for(int i:arr) if(i == max) count++ ;
        
        return Math.max(tasks.length,(max- 1)*(n + 1)+count) ;
    }
}