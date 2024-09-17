class Solution {
    public int numberOfSteps(int num) {
        int c=0;
        if(num==0){
            return 0;
        }
        while(num>0){
            c++;
            if(num%2==0){
                
                num/=2;
            }
            else{
                
                c++;
                
                num=num-1;
                num/=2;
            }
        }
        return c-1;
    }
}