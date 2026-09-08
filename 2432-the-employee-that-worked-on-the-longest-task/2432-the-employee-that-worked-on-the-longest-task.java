class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int id = -1 ;
        int max = -1 ;
        for(int i=0; i<logs.length; i++){
            int t = 0 ;
            if(i==0){
                t = logs[i][1] ;
            }
            else{
                t = logs[i][1] - logs[i-1][1] ;
            }
            if(t > max){
                max = t ;
                id = logs[i][0] ;
            }
            else if(t==max) id = Math.min(id, logs[i][0]) ;
        }
        return id ;
    }
}