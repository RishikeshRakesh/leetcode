class Solution {
    public int maxArea(int[] height) {
        int max=Integer.MIN_VALUE;
        int left=0;
        int right=height.length-1;
        int width=height.length-1;
        while(left<right){
            if(height[left]<height[right]){
                int ans=height[left]*width;
                  width--;
                  left++;

                if(max<ans){
                    max=ans;
                    
                }
               

            }
             else{
                int ans=height[right]*width;
                 width--;
                right--;

                if(max<ans){
                    max=ans;
                   
                }
                
            }


        }
        return max;
        
    }
}