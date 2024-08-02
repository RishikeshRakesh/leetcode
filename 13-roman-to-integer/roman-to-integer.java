class Solution {
    public int romanToInt(String s) {
        int prev=0;
        int ans=0;
        int num=0;
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if(c=='I'){
                num=1;
            }
             if(c=='V'){
                num=5;
            }
             if(c=='X'){
                num=10;
            }
             if(c=='L'){
                num=50;
            }
             if(c=='C'){
                num=100;
            } 
            if(c=='D'){
                num=500;
            }
             if(c=='M'){
                num=1000;
            }
        
        if(num<prev){ans-=num;}
        else{ans+=num;}
        prev=num;
    }
    return ans;
    }}