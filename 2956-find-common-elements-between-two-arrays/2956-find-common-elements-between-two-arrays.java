class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] ans = new int[2] ;
        int count1 = 0 ; 
        int count2 = 0 ; 
        Set<Integer> set1  = new HashSet<>() ;
        Set<Integer> set2  = new HashSet<>() ;
        for(int i:nums1) set1.add(i) ;
        for(int i:nums2) { set2.add(i) ; if(set1.contains(i)) count2++ ;}
        for(int i:nums1) if(set2.contains(i)) count1++ ;
        ans[0]= count1 ;
        ans[1]= count2 ;
        return ans ;
    }
}