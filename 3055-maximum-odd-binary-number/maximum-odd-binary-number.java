class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder sb=new StringBuilder();
        int c3=0;
        String str="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='1'){
                c3++;
            }
            else{
                sb.append(c);
            }
            if(c3>=2 && c!='0'){
                str+=c;
            }
        }
         int n=str.length()-1;
        if(c3==1){
            sb.append(1);
            return sb.toString();
        }
       
        else{
            sb.append(1);
            return str+sb.toString();
        }
        
    }
}