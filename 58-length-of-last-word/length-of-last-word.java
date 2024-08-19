class Solution {
    public int lengthOfLastWord(String s) {
        String ans=s.trim();
        int l=0;
        int c=0;
        int r=ans.length()-1;
        while(r>=l){
            if(ans.charAt(r)!=' '){
                c++;
                r--;
            }
            else{
                break;
            }
        }
        return c;
    }
}