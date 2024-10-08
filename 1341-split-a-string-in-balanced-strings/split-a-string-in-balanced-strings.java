class Solution {
    public int balancedStringSplit(String s) {
        int l=0;
        int c=0;
        for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='R'){
                    l++;
                }
                else{
                    l--;
                }
            
            if(l==0){
                c++;
            }
        }
        return c;
    }
}