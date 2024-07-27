class Solution {
    public int mySqrt(int x) {
        if(x==1 || x==0)
        return x;
        int s=1;
        int e=x;
        int mid=0;
        while(s<=e){
            mid=s+(e-s)/2;
            if(mid*mid==x){
                return mid;
            }
            else if((long)mid*mid>=(long)x){
                e=mid-1;
            }
            else{
                s=mid+1;
            }

    }
        return (int) e;
    }
}