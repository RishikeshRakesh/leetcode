class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0;
        int r=accounts[0].length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            sum=0;
            for(int j=0;j<r;j++){
                sum+=accounts[i][j];
            }
            if(max<sum){
                max=sum;
            }
        }
        return max;
    }
}