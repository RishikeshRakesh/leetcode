class Solution {
    public int differenceOfSum(int[] nums) {
        int val=0;
        int sum=0;
        int digit=0;
        for(int i=0;i<nums.length;i++){
            val+=nums[i];
            digit=0;
            if(nums[i]>9){
                 String str=""+nums[i];
                 for(int j=0;j<str.length();j++){
                      digit+=Character.getNumericValue(str.charAt(j));
                 }
                 sum+=digit;
            }
            else{
                sum+=nums[i];
            }
        }
        return val-sum;
    }
}