class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        String vow="aeiou";
        int c=0;
        while(left<=right){
            String str=words[left];
            String s=str.charAt(0)+"";
            String st=str.charAt(str.length()-1)+"";
            if(vow.contains(s) && vow.contains(st)){
                c++;
            }
            left++;
        }
        return c;
    }
}