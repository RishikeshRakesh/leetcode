class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int val=0;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                 map.put(nums[i],map.get(nums[i])+1);
            }
        }
        for(int a: map.keySet()){
            if(map.get(a)==1){
                val=a;
            }
        }
        return val;
    }
}