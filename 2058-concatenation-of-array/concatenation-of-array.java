class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length+nums.length;
        int[] arr=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(j<n){
            arr[j]=nums[i];
            if(i==nums.length-1){
                i=-1;
            }
            j++;
            }
        }
        return arr;
    }
}