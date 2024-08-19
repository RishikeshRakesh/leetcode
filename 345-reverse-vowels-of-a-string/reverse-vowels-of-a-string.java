class Solution {
    public String reverseVowels(String s) {
        int l=0;
        int r=s.length()-1;
        char[] c=s.toCharArray();
        while(l<r){
        
            if((s.charAt(l)=='A' || s.charAt(l)=='E' || s.charAt(l)=='I' || s.charAt(l)=='O' || s.charAt(l)=='U' || s.charAt(l)=='a' || s.charAt(l)=='e' || s.charAt(l)=='i'  || s.charAt(l)=='u'|| s.charAt(l)=='o' )&& ( s.charAt(r)=='A' || s.charAt(r)=='E' || s.charAt(r)=='I' || s.charAt(r)=='O' || s.charAt(r)=='U' || s.charAt(r)=='a' || s.charAt(r)=='e' || s.charAt(r)=='i'  || s.charAt(r)=='u'|| s.charAt(r)=='o')){
                char temp=s.charAt(r);
                c[r]=c[l];
                c[l]=temp;
                l++;
                r--;
            }
            else if(!(s.charAt(l)=='A' || s.charAt(l)=='E' || s.charAt(l)=='I' || s.charAt(l)=='O' || s.charAt(l)=='U' || s.charAt(l)=='a' || s.charAt(l)=='e' || s.charAt(l)=='i'  || s.charAt(l)=='u'|| s.charAt(l)=='o')){
                l++;
               
            }
            else if(!(s.charAt(r)=='A' || s.charAt(r)=='E' || s.charAt(r)=='I' || s.charAt(r)=='O' || s.charAt(r)=='U' || s.charAt(r)=='a' || s.charAt(r)=='e' || s.charAt(r)=='i'  || s.charAt(r)=='u'|| s.charAt(r)=='o')){
                r--;
            }
        }
        return new String(c);
    }
}