class Solution {
    public void solve(int[] nums,int s,int e){
        while(s<e){
            int temp=nums[s];
             nums[s]=nums[e];
             nums[e]=temp;
             s++;
             e--;
        }
    }
    public void rotate(int[][] matrix) {
            int n=matrix.length;
            int m=matrix[0].length;
            for(int i=0;i<=n-2;i++){
                for(int j=i+1;j<=m-1;j++){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }}
                for(int i=0;i<n;i++){
                solve(matrix[i],0,m-1);
                }
}
    
}