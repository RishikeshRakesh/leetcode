class Solution {
    public int maxArea(int[] height) {
        int max=Integer.MIN_VALUE;
        int left=0;
        int right=height.length-1;
        int width=height.length-1;
        while(left<right){
            int ans=0;
            if(height[left]<height[right]){
                ans=height[left]*width;
                  width--;
                  left++;
                    
                
               

            }
             else{
                ans=height[right]*width;
                 width--;
                right--;

                
                   
                }
                
             if(max<ans){
                    max=ans;}


        }
        return max;
        
    }
}