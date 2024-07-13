class Solution {
    public String clearDigits(String s) {
         StringBuffer sb=new StringBuffer();
         for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='0' && c<='9'){
               sb.deleteCharAt(sb.length()-1);
            }
            else{
                sb.append(c);
            }
         }
         return sb.toString();
    }
}