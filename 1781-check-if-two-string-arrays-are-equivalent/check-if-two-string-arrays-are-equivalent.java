class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<word1.length;i++){
            sb.append(word1[i]);
        }
         StringBuilder sb1=new StringBuilder();
        for(int i=0;i<word2.length;i++){
            sb1.append(word2[i]);
        }
        String s1=sb.toString();
        String s2=sb1.toString();
        return s1.equals(s2);
    }
}