class Solution {
    public String[] findWords(String[] words) {
        List<String> li=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String s=words[i].toLowerCase();
            if(keyboard(s)){
                li.add(words[i]);
            }
        }
        String[] val = new String[li.size()];
        int i=0;
        for(String ans : li){
            val[i++]=ans;
        }
        return val;
    }
    public static boolean keyboard(String s){
        String s1="qwertyuiop";
        String s2="asdfghjkl";
        String s3="zxcvbnm";
        int x=0,y=0,z=0;
        for(int i=0;i<s.length();i++){
            String j=s.charAt(i)+"";
            if(s1.contains(j))
                x++;
            if(s2.contains(j))
                y++;
            if(s3.contains(j))
                z++;
        }
        if(x==s.length() || y==s.length() || z==s.length()){
            return true;
        }
        else
        return false;
    }
}