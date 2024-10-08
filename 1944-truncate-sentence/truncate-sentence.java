class Solution {
    public String truncateSentence(String s, int k) {
        String str="";
        String[] s1=s.split(" ");
        for(int i=0;i<k-1;i++){
            str+=s1[i]+" ";
            
        }
        str+=s1[k-1];
        return str;
    }
}