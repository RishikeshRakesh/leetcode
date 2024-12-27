class Solution {
    public boolean isPowerOfTwo(int n) {
        // if(n==1){
        //     return true;
        // }
        // k=1;
        for(int i=0;i<31;i++){
            int  k=(int)Math.pow(2,i);
            if(k==n){
                return true;
            }
        }
        return false;
    }
}