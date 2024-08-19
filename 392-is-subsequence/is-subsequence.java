class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        int s1=s.length();
        int s2=t.length();
        while(s1>i && s2>j){
           
            if(s.charAt(i)==t.charAt(j)){
                  i++;
            }
            j++;
        }
        return i==s1;
    }
}