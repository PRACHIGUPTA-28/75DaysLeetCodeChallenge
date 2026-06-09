class Solution {
    public int[][] insert(int[][] intl, int[] newl) {
        List<List<Integer>> ls = new ArrayList<>() ;
        int i=0; 
        boolean inserted =  false ;
        for(i=0; i<intl.length; i++){
            List<Integer> list = new ArrayList<>() ;
            if(intl[i][1] < newl[0]){
                list.add(intl[i][0]) ;
                list.add(intl[i][1]) ;
                ls.add(list) ;
            }
            else if(newl[1] < intl[i][0]){
                if(!inserted){
                list = new ArrayList<>() ;
                list.add(newl[0]) ;
                list.add(newl[1]) ;
                ls.add(list) ; 
                inserted = true ;}
                list = new ArrayList<>() ;
                list.add(intl[i][0]) ;
                list.add(intl[i][1]) ;
                ls.add(list) ;}
            else{
                newl[0] = Math.min(newl[0], intl[i][0]) ;
                newl[1] = Math.max(newl[1], intl[i][1]) ;
            }
        }
        if(!inserted){
                List<Integer> list = new ArrayList<>() ;
                list.add(newl[0]) ;
                list.add(newl[1]) ;
                ls.add(list) ;  }

        int[][] arr = new int[ls.size()][2] ;
        for(i=0; i<ls.size(); i++){
            arr[i][0] = ls.get(i).get(0) ;
            arr[i][1] = ls.get(i).get(1) ; 
        }
        return arr ;
    }
}