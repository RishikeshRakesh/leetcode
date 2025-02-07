class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<String,Integer> map = new HashMap<>();
        
            
            for(int i=0;i<s.length();i++){
                String str=s.charAt(i)+"";
                if(map.containsKey(str)){
                     map.put(str, map.get(str) + 1);
                }
                else{
                    map.put(str,1);
                }
            }
        
        if(map.size()==1){
            return true;
        }
        int m=0,j=0;
        for(int val : map.values()){
            if(m==0){
             j=val;
             m++;
            }
            else
            if(j!=val){
                return false;
            }
            j=val;
        }

        return true;
        }
}