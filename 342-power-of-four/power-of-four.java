class Solution {
    public boolean isPowerOfFour(int n) {
        if(2147483647==n){
            return false;
        }
        for(int i=0;i<=31;i++){
            int k=(int)(Math.pow(4,i));
            if(k==n){
                return true;
            }
        }
        return false;
    }
}