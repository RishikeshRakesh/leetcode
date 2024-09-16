class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr=new int[m][n];
        int c1=0;
         for (int[] index : indices) {
            int row = index[0];
            int col = index[1];
            for(int i=0;i<n;i++){
                arr[row][i]+=1;
            }
            for(int i=0;i<m;i++){
                arr[i][col]+=1;
              }
            
           
        }
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]%2!=0){
                    c++;
                }
            }
        }
        return c;
    }
}