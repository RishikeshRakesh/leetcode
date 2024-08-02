class Solution {
    public boolean isPowerOfThree(int n) {
        //  while(n>1){
        //     if(n%3==0){
        //          n=n/3;
               
        //     }
        //  }  
       
         return (Math.log10(n) / Math.log10(3)) % 1 ==0;
     }
}