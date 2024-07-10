class Solution {
    public void reverseString(char[] s) {
         int i=0;
         int a=s.length-1;
         while(a>i){
         char temp=s[i];
         s[i]=s[a];
         s[a]=temp;
         i++;
         a--;
        }

    }
}