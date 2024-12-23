class Solution {
    public double minimumAverage(int[] nums) {
        int l=0;
        int r=nums.length-1;
        Arrays.sort(nums);
        double sum=0;
        Double max=Double.MAX_VALUE;
        while(l<r){
            sum=(nums[l]+nums[r])/2.0;
            max=Math.min(sum,max);
            r--;
            l++;
        } 
        return max;
    }
}