class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length] ;
        Stack<Integer> st = new Stack<>() ;
        Map<Integer,Integer> map = new HashMap<>() ;
        for(int i=0; i<nums2.length; i++){
            while(!st.isEmpty() && st.peek() < nums2[i]){
                map.put( st.pop(), nums2[i]) ;
                }
                st.push(nums2[i]) ;
            }
        while(!st.isEmpty()){
            map.put(st.pop(), -1) ;
        }
        for(int i=0; i<nums1.length; i++){
            arr[i] = map.get(nums1[i]) ;
        }
        return arr ;
   }
}