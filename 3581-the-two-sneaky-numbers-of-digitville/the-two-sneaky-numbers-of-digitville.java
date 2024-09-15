class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int c=1;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            c=1;
            for(int j=i+1;j<nums.length;j++){
                 if(nums[i]==nums[j]){
                    c++;
                 }
            }
            if(c==2){
                list.add(nums[i]);
                }
        }
        int[] arr=new int[list.size()];
        for(int i=0;i<arr.length;i++){
                 arr[i]=list.get(i);
        }
       
        return arr;
    }
}