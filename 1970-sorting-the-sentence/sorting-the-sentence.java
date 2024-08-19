class Solution {
    public String sortSentence(String s) {
        String[] str= s.split(" ");
        String[] val=new String[str.length];
        for(int i=0;i<str.length;i++){
            int n=str[i].charAt(str[i].length()-1)-'0';
            val[n-1]=str[i].substring(0,str[i].length()-1);
        }
        String ans="";
        for(int i=0;i<val.length-1;i++){
            ans=ans+val[i]+" ";
        }
        ans=ans+val[val.length-1];
        return ans;
    }
}