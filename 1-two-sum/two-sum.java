import java.util.Hashtable;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> n=new  Hashtable<>();
        for(int i=0;i<nums.length;i++){
            if(n.containsKey((target-nums[i]))){
                return new int[]{n.get(target-nums[i]), i};
            }
            n.put(nums[i], i);
        }
        return null;
    }
}