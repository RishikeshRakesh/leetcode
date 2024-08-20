class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        int s=0;
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1){
                if(i==s){
                        String s1=String.valueOf(nums[i]);
                        list.add(s1);
                    }
                    else{
                        String p=""+nums[s];
                        String p1=""+nums[i];
                        String p2=p+"->"+p1;
                        list.add(p2);
                    }

            }
            else{
                if(nums[i]+1==nums[i+1]){
                    continue;
                }
                else{
                    if(i==s){
                        String s1=String.valueOf(nums[i]);
                        list.add(s1);
                        s=i+1;
                    }
                    else{
                        String p=""+nums[s];
                        String p1=""+nums[i];
                        String p2=p+"->"+p1;
                        list.add(p2);
                        s=i+1;
                    }
                }
            }
        }
        return list;
    } 
}