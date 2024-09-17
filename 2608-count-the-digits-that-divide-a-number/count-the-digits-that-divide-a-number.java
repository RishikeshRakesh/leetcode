class Solution {
    public int countDigits(int num) {
         String s=""+num;
        
         int c1=0;
         for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int n=Character.getNumericValue(c);
            if(num%n==0){
                    c1++;
            }
         }
         return c1;
    }
}