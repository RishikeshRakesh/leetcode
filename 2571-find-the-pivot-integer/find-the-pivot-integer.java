class Solution {
    public int pivotInteger(int n) {
        int sum=0;
        int val=0;
        for(int i=1;i<=n;i++){
             val+=i;
            sum=0;
            for(int j=i;j<=n;j++){
                sum+=j;
            }
            if(val==sum){
                return i;
            }
        }
        return -1;
    }
}