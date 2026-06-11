class Solution {
    public int hammingWeight(int n) {
        int set = 0 ;
        while(n>0){
            set += n % 2 ;
            n /= 2 ;
        }
            return set ;
    }
}