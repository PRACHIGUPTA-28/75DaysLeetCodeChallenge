class Solution {
    public int[][] merge(int[][] in) {
        List<int[]> ls = new ArrayList<>() ;
        Arrays.sort(in, (a,b)-> a[0]-b[0]) ;
        int[] curr = in[0] ;
        for(int i=1; i<in.length; i++){
            if(curr[1] >= in[i][0]){
             curr[1] = Math.max(curr[1], in[i][1]) ;
            }
            else{
                ls.add(curr) ;
                curr = in[i] ;
            }
        }
        ls.add(curr) ;
        return ls.toArray(new int[ls.size()][2]) ;
    }
}