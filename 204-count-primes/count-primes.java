class Solution {
    public int countPrimes(int n) {
     boolean[] b=new boolean[n];
     for(int i=2;i<Math.sqrt(n);i++){
        if(b[i]==false){
        for(int j=2;i*j<n;j++){
            b[i*j]=true;
        }
     }   }
     int countPrimes=0;
     for(int i=2;i<n;i++){
         if(b[i]==false){
            countPrimes++;
         }
     }
     return countPrimes;
    }
}