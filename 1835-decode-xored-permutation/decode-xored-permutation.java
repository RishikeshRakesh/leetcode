class Solution {
    public int[] decode(int[] encoded) {
        int a=0;
        int b=0;
        int n=encoded.length+1;
        for(int i=1;i<n;i+=2){
            a^=encoded[i];
        }
        for(int j=1;j<=n;j++){
            b^=j;
        }
        
        int[] val=new int[n];
        val[0]=a^b;
        for(int i=0;i<encoded.length;i++){
            val[i+1]=val[i]^encoded[i];
        }
        return val;
    }
}