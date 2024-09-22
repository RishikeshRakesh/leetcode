class Solution {
    public int missingNumber(int[] nums) {
        int ans=0;
       List<Integer> list = new ArrayList<>();
       for(int i=0;i<=nums.length;i++){
          list.add(i);
       }
        for(int i=0;i<nums.length;i++){
           if(list.contains(nums[i])){
           list.remove(Integer.valueOf(nums[i]));
           }
        }
       return list.get(0);
}
}