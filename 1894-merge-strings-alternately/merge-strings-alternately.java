class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length();
        int n1=word2.length();
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(i<n || i<n1){
            if(i<n){
                sb.append(word1.charAt(i));
            }
            if(i<n1){
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}