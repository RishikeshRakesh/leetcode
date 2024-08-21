class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        double max=Integer.MIN_VALUE;

        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        max=sum/k;
        for(int i=k;i<nums.length;i++){
               sum+=nums[i] - nums[i-k];
               double sum1=sum/k;
               
               if(max<sum1){
                max=sum1;
               }
              }
    
    return max;
}}