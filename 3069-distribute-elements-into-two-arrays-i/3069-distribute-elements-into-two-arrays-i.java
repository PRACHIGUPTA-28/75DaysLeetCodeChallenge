class Solution {
    public int[] resultArray(int[] nums) {
        int[] a1 = new int[nums.length] ;
        int[] a2 = new int[nums.length] ;
        a1[0] = nums[0] ;
        a2[0] = nums[1] ;
        int a = 1 ;
        int b = 1 ;
        for(int i=2; i<nums.length; i++){
            if(a1[a-1] > a2[b-1]) a1[a++] = nums[i] ;
            else a2[b++] = nums[i] ;
        } 
        for(int i =0; i<=a; i++){
            if(a1[i] == 0) break ;
            nums[i] = a1[i] ;
        }
        for(int i =0; i<=b; i++){
            if(a2[i] == 0) break ;
            nums[i+a] = a2[i] ;
        }
        return nums ;
    }
}