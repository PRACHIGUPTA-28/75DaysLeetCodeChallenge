class Solution {
    public int maxArea(int[] height) {
        int max = 0 ;
       int left = 0 ; 
       int right = height.length-1 ; 
       while(left<right){ // till they do not cross each other
            if(max < ( right - left )*( Math.min( height[left] , height[right] ) ) ){
                max = ( right - left )*( Math.min( height[left] , height[right] ) ) ; 
            }
       
       if( height[left] < height[right] ){ left ++ ; }
       else{ right -- ; }
       }
        return max ; 
    }
}