class Trie {
    Trie[] children ;
    boolean eow ; 
    Trie root ; 
    public Trie() {
        children = new Trie[26] ; 
        for( int i = 0 ; i < 26 ; i++){
            children[i] = null ;
        }
        eow = false ; 
        
        
        root = this ;
    }

    public void insert(String word) {
        Trie curr = root ;
        for( int i = 0 ; i < word.length() ; i++){
            int idx = word.charAt(i) - 'a' ; 
            if( curr.children[idx] == null){
                curr.children[idx] = new Trie() ;
            }
            if( i == word.length()-1 ){
                curr.children[idx].eow = true ;
            }
            curr = curr.children[idx] ; 
        }
    }
    
    public boolean search(String word) {
        Trie curr = root ;
        for( int i = 0 ; i < word.length() ; i++){
            int idx = word.charAt(i)-'a' ;
            Trie node = curr.children[idx] ;
            if( node == null) return false ; 
            if( i == word.length()-1 && node.eow == false) return false ;
            curr = node ;
        }
        return true ;
    }
    
    public boolean startsWith(String prefix) {
        Trie curr = root ;
        for( int i = 0 ; i < prefix.length() ; i++){
            int idx = prefix.charAt(i) - 'a' ;
            Trie node = curr.children[idx] ;
            if( node == null) return false ;
            curr = node ;
        }
        return true ;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */