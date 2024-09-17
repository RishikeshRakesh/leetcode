class Solution {
    public boolean canAliceWin(int[] nums) {
      int sum=0,val=0;
       for(int i=0;i<nums.length;i++){
           if(nums[i]<=9){
               sum+=nums[i];
           }
           else{
               val+=nums[i];
           }
       }
    if(sum>val || val>sum){
         return true;
    }
    return false;
  }
}