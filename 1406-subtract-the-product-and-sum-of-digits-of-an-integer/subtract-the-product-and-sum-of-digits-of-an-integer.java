class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int val=1;
        while(n>0){
            int num=n%10;
            val*=num;
            sum+=num;
            n/=10;
        }
        return val-sum;
    }
}