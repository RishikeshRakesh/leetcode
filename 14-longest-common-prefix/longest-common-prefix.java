class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pre=strs[0];
        for(int i=1;i<strs.length;i++){
            String temp="";

             int min= Math.min(pre.length(), strs[i].length());

             for(int j=0;j<min;j++){
                if(pre.charAt(j) !=strs[i].charAt(j) ){
                     break;
                }
                temp+=pre.charAt(j);
             }

             pre=temp;


        }
        return pre;
    }
}