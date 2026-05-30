class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] ht) {
        List<List<Integer>> ls = new ArrayList<>() ;
        int[][] pac = new int[ht.length][ht[0].length] ;
        int[][] atl = new int[ht.length][ht[0].length] ;
        for(int i=0; i<ht.length; i++){
            fn(ht, pac, i, 0) ;
            fn(ht,atl, i, ht[0].length-1) ;
        }
        for(int i=0; i<ht[0].length; i++){
            fn(ht, pac, 0, i) ;
            fn(ht, atl, ht.length-1, i) ;
        }
        for(int i=0; i<ht.length; i++){
            for(int j=0; j<ht[0].length; j++){
                if(pac[i][j] == 1 && atl[i][j] == 1){
                    List<Integer> ans = new ArrayList<>() ;
                    ans.add(i) ;
                    ans.add(j) ;
                    ls.add(ans) ;
                }
            }
        }
        return ls ;
    }
    public void fn(int[][] ht, int[][] arr, int r, int c){

        if(r<0 || r>ht.length-1 || c<0 || c>ht[0].length-1) return ;

        if(arr[r][c] == 1) return ;

        arr[r][c] = 1 ;

        if(r+1<ht.length && ht[r+1][c] >= ht[r][c])
        fn(ht, arr, r+1, c) ;

        if(r-1>=0 && ht[r-1][c] >= ht[r][c])
        fn(ht, arr, r-1, c) ;

        if(c-1>=0 && ht[r][c-1] >= ht[r][c])
        fn(ht, arr, r, c-1) ;

        if(c+1<ht[0].length && ht[r][c+1] >= ht[r][c])
        fn(ht, arr, r, c+1) ;
    }
}