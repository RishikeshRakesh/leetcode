class Solution {
    public void moveZeroes(int[] nums) {
        int c=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[k]=nums[i];
                k++;
        }
             else  if(nums[i]==0){
                   c+=1;
               }
    for(int j=0;j<c;j++){
        nums[i]=0;
    }
            
        }
        
    }
}