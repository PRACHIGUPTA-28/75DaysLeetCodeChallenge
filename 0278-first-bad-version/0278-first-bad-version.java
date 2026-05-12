/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
       int i=1; 
       int j=n ;
       while(i<j){
        int mid = (j-i)/2 + i ;
        if(isBadVersion(mid)) j = mid ;
        else i = mid+1 ;
       }
       return j ;
    }
}