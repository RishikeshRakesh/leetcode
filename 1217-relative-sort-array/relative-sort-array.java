class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int c=0;
        List<Integer> li=new ArrayList<>();
        List<Integer> li1=new ArrayList<>();
        for(int i=0;i<arr2.length;i++){
            c=0;
            for(int j=0;j<arr1.length;j++){
                  if(arr2[i]==arr1[j]){
                    c++;
                  }
            }
            
            for(int k=0;k<c;k++){
                li.add(arr2[i]);
            }
        }
        for(int i=0;i<arr1.length;i++){
            if(!li.contains(arr1[i])){
                 li1.add(arr1[i]);
            }
        }
       
        int[] sor=new int[li1.size()];
        for(int i=0;i<li1.size();i++){
            sor[i]=li1.get(i);
        }
        int[] arr=new int[li.size()+li1.size()];
         for(int i=0;i<li.size();i++){
            arr[i]=li.get(i);
        }
        Arrays.sort(sor);
        int m=0;
        for(int i=li.size();i<arr.length;i++){
            arr[i]=sor[m++];
        }

        return arr;
    }
}