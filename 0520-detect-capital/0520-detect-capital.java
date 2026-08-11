class Solution {
    public boolean detectCapitalUse(String word) {
        int low = 0 ;
        int cap = 0;
        for(int i=0; i<word.length(); i++){
            if(Character.isLowerCase(word.charAt(i))){
                if(cap > 1) return false ;
                low++;
            }
            else{
                if(low != 0) return false ;
                else cap++ ;
            }
        }
        return true ;
    }
}