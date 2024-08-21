class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int n1=flowerbed.length;
        if(flowerbed[0]==0 && flowerbed.length==1){
            return true;
        }

        if(flowerbed[0]==0 && flowerbed[1]==0){
            flowerbed[0]=1;
            n--;
        }
        if(flowerbed[n1-1]==0 && flowerbed[n1-2]==0){
            flowerbed[n1-1]=1;
            n--;
        }

        
        for(int i=1;i<flowerbed.length-1;i++){
            if(flowerbed[i]==0){
            if(flowerbed[i-1]==0 && flowerbed[i+1]==0){
               n--;
               flowerbed[i]=1;
            }
            }
}    
        if(n<=0){
            return true;
          }
     return false;
    }
}