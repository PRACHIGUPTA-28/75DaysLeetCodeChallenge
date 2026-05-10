class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>() ;
        int max = 0 ; 
        for(int i=0; i<=heights.length; i++){
            int curr = (i==heights.length)? 0 : heights[i] ;
            while(!st.isEmpty() && curr < heights[st.peek()]){
            int height = heights[st.pop()] ;
            int right = i ; 
            int left = st.isEmpty() ? -1 : st.peek() ;
            int width = right-left-1 ;
            max = Math.max(height*width , max) ;
            }
            st.push(i) ;
        }
        return max ;
    }
}