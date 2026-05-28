class Solution {
    public int numIslands(char[][] grid) {
        int n = 0 ;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == '0') continue ;
                 fn(grid, i, j) ;
                 n++ ;
            }
        }
        return n ;
    }
    public void fn(char[][] grid, int r, int c){
        if(r<0 || r>grid.length-1 || c<0 || c>grid[0].length-1 || grid[r][c] == '0') return ;
        grid[r][c] = '0' ;
         fn(grid, r+1, c) ;
            fn(grid, r-1, c) ;
               fn(grid, r, c+1) ;
               fn(grid, r, c-1) ;
    }
}