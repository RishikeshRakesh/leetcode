

class Solution {
    public void solve(int[] nums, int start, List<List<Integer>> res) {
        if (start == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            res.add(new ArrayList<>(list));
            return;
        }
        Set<Integer> seen = new HashSet<>();
        for (int i = start; i < nums.length; i++) {
            if (seen.contains(nums[i])) continue;
            seen.add(nums[i]);
           int temp = nums[i];
            nums[i] = nums[start];
            nums[start] = temp;
            solve(nums, start + 1, res);
              temp = nums[i];
             nums[i] = nums[start];
             nums[start] = temp;
        }
    }

    
    

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums); 
        List<List<Integer>> res = new ArrayList<>();
        solve(nums, 0, res);
        return res;
    }
}