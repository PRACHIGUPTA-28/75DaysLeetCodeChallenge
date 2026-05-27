class Solution {
    public int countIslands(int[][] grid, int k) {
        int count = 0 ;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 0) continue ;
                long a = fn(grid, i, j) ;
                if(a % k == 0) count++ ;
            }
        }
        return count ;
    }
    public long fn(int[][] grid, int r, int c){
        if(r<0 || r>grid.length-1 || c<0 || c>grid[0].length-1 || grid[r][c] == 0) return 0 ;
        long p = grid[r][c] ;
        grid[r][c] = 0 ; 
        return fn(grid, r+1, c) +
                fn(grid, r-1, c) +
                fn(grid, r, c-1) +
                fn(grid, r, c+1) + p ;
    }
}