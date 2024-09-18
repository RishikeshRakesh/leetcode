class Solution {
    public int numberOfSteps(int num) {
        int c=0;
        if(num==0){
            return 0;
        }
        while(num>0){
           
            if(num%2==0){
                 c++;
                num/=2;
            }
            else{
                
               
                
                num=num-1;
                c++;
            }
        }
        return c;
    }
}