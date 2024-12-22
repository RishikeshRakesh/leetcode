class Solution {
    public int addDigits(int num) {
        int sum=0;
        int ans=0;
       
        while(num>0){
                int n=num;
                while(n>0){
                int d=n%10;
                sum+=d;
                n/=10;
                }
            num=sum;
            n=num;
            if(n<=9 && n>=0){
                ans=n;
                break;
            }
            sum=0;
        }
        
       return ans;
    }
}