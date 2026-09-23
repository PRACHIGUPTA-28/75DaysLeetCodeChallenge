class Solution {
    public String[] divideString(String s, int k, char fill) {
       List<String> ls = new ArrayList<>() ;
       StringBuilder sb = new StringBuilder() ;
       for(char c : s.toCharArray()){
          sb.append(c) ;
          if(sb.length() == k){
            ls.add(sb.toString()) ;
            sb.setLength(0) ;
          }
       }
       if(sb.length() != 0){
        while(sb.length() < k){
            sb.append(fill) ;
        }
        ls.add(sb.toString()) ;
       }

       int idx = 0 ;
       String[] ans = new String[ls.size()] ;
       for(String str : ls){
        ans[idx++] = str ;
       } 
       return ans ;
    }
}