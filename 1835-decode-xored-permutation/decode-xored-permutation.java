class Solution {
    public int[] decode(int[] encoded) {
        int a=0;
        int b=0;
        int n=encoded.length+1;
        for(int i=0;i<n-1;i+=2){
            a^=encoded[i];
        }
        for(int j=0;j<=n;j++){
            b^=j;
        }
        
        int[] val=new int[n];
        val[n-1]=a^b;
        for(int i=n-2;i>=0;i--){
            val[i]=val[i+1]^encoded[i];
        }
        return val;
    }
}