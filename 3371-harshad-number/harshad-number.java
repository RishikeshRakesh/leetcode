class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int val=0;
        int ans=x;
        while(x!=0){
            int rem=x%10;
            val+=rem;
            x/=10;
        }
       
        if(ans%val==0){
            return val;
        }
        else{
            return -1;
        }
    }
}