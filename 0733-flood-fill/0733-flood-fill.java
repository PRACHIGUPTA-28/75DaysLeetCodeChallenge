class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int org = image[sr][sc] ;
        if (org == color) return image ;
        fn(image, sr, sc, color, org) ;
        return image ;
    }
    public void fn(int[][] image, int sr, int sc, int color, int org){
        if(sr<0 || sc<0 || sr>image.length-1 || sc>image[0].length-1) return ;

        if(image[sr][sc] != org) return ; 
         image[sr][sc] = color ;

        fn(image, sr, sc-1, color, org) ;
        fn(image, sr, sc+1, color, org) ;
        fn(image, sr-1, sc, color, org) ;
        fn(image, sr+1, sc, color, org) ;
    }
}