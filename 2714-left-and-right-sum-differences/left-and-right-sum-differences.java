class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] num=new int[nums.length];
        num[0]=0;
        int sum1=0;
        for(int i=1;i<nums.length;i++){
            sum1+=nums[i-1];
            num[i]+=sum1;
        }

        int[] num1=new int[nums.length];
         num1[nums.length-1]=0;
         int sum=0;
        for(int i=nums.length-2;i>=0;i--){
         sum+=nums[i+1];
            num1[i]+=sum;
        }

        int[] num2=new int[nums.length];
        for(int i=0;i<nums.length;i++){
           
                 num2[i]=Math.abs(num[i]-num1[i]);
            
        }
        return num2;
        
    }
}