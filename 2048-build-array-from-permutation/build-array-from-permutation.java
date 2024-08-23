class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     ans[i]=nums[nums[i]];
        // }
        // return ans;
 int s=0;
        while(s<nums.length){
            ans[s]=nums[nums[s]];
            s++;
        }
        return ans;
    }
}