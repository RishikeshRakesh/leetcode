class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        int val=nums[0];
        int val2=nums[nums.length-1];
        if(nums.length<=2){
            return -1;
        }
        else{
            return nums[1];
        }
    }
}