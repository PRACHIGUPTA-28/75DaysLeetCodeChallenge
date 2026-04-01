class Solution {
    public int evalRPN(String[] tokens) {
        int sum = 0 ; 
        Stack<Integer> stack = new Stack<>() ; 
        for( int i = 0 ; i < tokens.length ; i++){
           String ch =  tokens[i] ; 
           switch( ch ){
            case "+" : int a = stack.pop() ; int b = stack.pop() ; 
                        sum = a + b ; stack.push(sum) ; break ; 
            case "-" :  a = stack.pop() ;  b = stack.pop() ; 
                        sum = b - a ; stack.push( sum ) ;  break ; 
            case "*" :  a = stack.pop() ;  b = stack.pop() ; 
                        sum = a * b ; stack.push( sum ) ;  break ; 
            case "/" :  a = stack.pop() ;  b = stack.pop() ; 
                        sum = b / a ; stack.push( sum ) ;  break ;
            default : stack.push( Integer.parseInt(ch) ) ; break ;
           }
        }
        return stack.pop() ; 
    }
}