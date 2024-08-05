class Solution {
    public int findPermutationDifference(String s, String t) {
        int val=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<t.length();j++){
                char x=s.charAt(i);
                char u=t.charAt(j);
                if(x==u){
                    val+=Math.abs(i-j);
                }
            }
        }
        return val;
    }
}