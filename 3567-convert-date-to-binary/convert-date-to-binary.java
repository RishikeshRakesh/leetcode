class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        String s="";
        int num=0;
        int val=0;
        for(int i=0;i<date.length();i++){
            char c=date.charAt(i);
            num=0;
            val=0;
            s="";
            if(c=='-'){
                String str=sb.toString();
                sb.setLength(0);
                val=Integer.parseInt(str);
                s=Integer.toBinaryString(val);
                sb1.append(s);
                sb1.append("-");
                
            }
            else{
                 num=Character.getNumericValue(c);
                 sb.append(num);
            }
        }
        String str=sb.toString();
                sb.setLength(0);
                val=Integer.parseInt(str);
                s=Integer.toBinaryString(val);
                sb1.append(s);
                
        return sb1.toString();
    }
}