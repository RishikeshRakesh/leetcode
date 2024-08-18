class Solution {
    public int maxArea(int[] height) {
      int l=0;
      int r=height.length-1;
      int max=Integer.MIN_VALUE;
      int ans=0;
      while(l<r){
         int width=r-l;
         if(height[l]<height[r]){
            ans=width*height[l];
            l++;
         }
         else{
          ans=width*height[r];
         r--;
      }
      if(max<ans){
        max=ans;
      }
      }  
      return max;
    }
}