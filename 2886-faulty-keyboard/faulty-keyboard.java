class Solution {
    public String finalString(String s) {
        StringBuilder s1=new StringBuilder();
     for(int i=0;i<s.length();i++){
        
        char c=s.charAt(i);
        
        if(c=='i'){
            s1.reverse();
        }
        else{
            s1.append(c);
        }
     }   
     return s1.toString();
    }
}