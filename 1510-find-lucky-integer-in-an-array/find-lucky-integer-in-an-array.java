class Solution {
    public int findLucky(int[] arr) {
        int sum=0;
        int max=-1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int c=0;
            sum=arr[i];
           for(int j=0;j<arr.length;j++){
              if(arr[i]==arr[j]){
                 c++;
              }
             
           }
            if(sum==c){
           if(sum>max){
               max=sum;
           }
        }
    }
           return max;
    }
}