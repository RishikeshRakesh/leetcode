class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
       
        int val=0;
        int val1=0;
        for(int i=0;i<coordinate1.length();i++){
            char c=coordinate1.charAt(i);
            char cs=coordinate2.charAt(i);
             
             if(Character.isDigit(c) || Character.isDigit(cs)){
                val+=Character.getNumericValue(c);
                val1+=Character.getNumericValue(cs);
             }
             else{
             val+=(c-'a');
             val1+=(cs-'a');
             }
        }
       
     
       return (val % 2 == 0 )== (val1 % 2 == 0);
    }
}