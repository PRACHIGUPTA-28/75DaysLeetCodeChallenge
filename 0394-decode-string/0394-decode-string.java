class Solution {
    public String decodeString(String s){
        Stack<Integer> s1 = new Stack<>() ;
        Stack<String> s2 = new Stack<>() ;
        return fn(s,s1,s2) ;
    }
    public String fn(String s, Stack<Integer> s1, Stack<String> s2){
        int n = 0 ; 
        String str ="" ;
        String s3 = "" ;
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                n = n*10 + s.charAt(i)-'0' ;
            }
            else if(s.charAt(i)=='['){
                s1.push(n) ;
                s2.push(str) ;
                n=0;
                str ="" ;
            }
            else if(s.charAt(i)==']'){
                if(!s1.isEmpty()){
                int m = s1.pop() ;
                while(m-->0){
                    s3 += str ;
                }
                str = s2.pop()+s3 ;
                }
                s3 ="" ;
            }
            else{
                str += s.charAt(i) ;
            }
        }
    return str ;
    }
}