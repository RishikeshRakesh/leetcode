class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int s=m-1;
        int p=n-1;
        int l=nums1.length-1;
        while(p>=0){
             if(s>=0 && nums1[s]>nums2[p]){
                nums1[l]=nums1[s];
            
             s--;
             l--;}
             else{
                nums1[l]=nums2[p];
                p--;
                l--;
             }
        }
    }
}