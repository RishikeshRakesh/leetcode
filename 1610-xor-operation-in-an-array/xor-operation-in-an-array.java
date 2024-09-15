class Solution {
    public int xorOperation(int n, int start) {
        int ans=0;
        int f=1;
        for(int i=start;f<=n;i+=2){
            ans^=i;
            f++;
        }
        return ans;
    }
}