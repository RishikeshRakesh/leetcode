class Solution {
    public int addDigits(int num) {
        int sum=0;
        int ans=0;
       
        while(num>0){
               
                while(num>0){
                int d=num%10;
                sum+=d;
                num/=10;
                }
            num=sum;
            
            if(num<=9 && num>=0){
                ans=num;
                break;
            }
            sum=0;
        }
        
       return ans;
    }
}