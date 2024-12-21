class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int dummy[] = new int[heights.length];
        for(int i=0;i<dummy.length;i++){
            dummy[i] = heights[i];
        }
        String s[] = new String[heights.length];
        String ans[] = new String[heights.length];
        Arrays.sort(dummy);
        for(int i=0;i<heights.length;i++){
             for(int j=0;j<heights.length;j++){
                if(heights[i] == dummy[j]){
                       s[j]=names[i];
                        break;
                }
             }
        }
        int k=0;
        for(int i=s.length-1;i>=0;i--){
            ans[k++]=s[i];
        }

        return ans;
    }
}