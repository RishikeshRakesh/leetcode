class Solution {
    public int reverse(int x) {
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        long a=0;;
        while(x!=0){
             a=a*10+x%10;
             x/=10;  
             }
             if(min>a || max<a)
                 return 0;
             return (int)a;
    }
}