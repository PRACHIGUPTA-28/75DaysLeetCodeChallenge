class Solution {
    public boolean scoreBalance(String s) {
        int[] pref = new int[s.length()] ;
        for(int i=0; i<s.length() ;i++){
            if(i==0) pref[i] = s.charAt(i) - 'a' +1 ;
            else{
                pref[i] = pref[i-1] + s.charAt(i) - 'a' +1 ;
            }
        }
        int n = pref[s.length()-1] ;
        for(int i=0; i<pref.length; i++){
            if(pref[i] == n-pref[i]) return true ;
        }
        return false ;
    }
}