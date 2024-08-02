class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int co=0;
        for(int i=0;i<jewels.length();i++){
            for(int j=0;j<stones.length();j++){
                char c=jewels.charAt(i);
                char c1=stones.charAt(j);
                if(c==c1){
                    co+=1;
                }
                else{
                    continue;
                }
            }
        }
        return co;
    }
}