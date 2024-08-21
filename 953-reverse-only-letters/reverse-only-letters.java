class Solution {
    public String reverseOnlyLetters(String s) {
        int l=0;
        int r=s.length()-1;
        char[] c=s.toCharArray();
        while(l<r){
            if(!Character.isLetter(c[l])){
                l++;
                continue;
            }
            if(!Character.isLetter(c[r])){
                r--;
                continue;
            }
            char temp=c[l];
            c[l]=c[r];
            c[r]=temp;
            l++;
            r--;
        }
        return new String(c);
    }
}