class Solution {
     public void solve(int i,String digits,List<String> res,String str,HashMap<Character,String> val){
            if(i==digits.length()){
                res.add(str);
                return;
            }
            else{
                String ad=val.get(digits.charAt(i));
                for(int in=0;in<ad.length();in++){
                    solve(i+1,digits,res,str+ad.charAt(in),val);
                }
            }
        }


    public List<String> letterCombinations(String digits) {
       
        List<String> res=new ArrayList<>();
        String str="";
        if(digits.length()==0){
            return res;
        }
        HashMap<Character,String> val=new HashMap<>();
        val.put('2',"abc");
        val.put('3',"def");
        val.put('4',"ghi");
        val.put('5',"jkl");
        val.put('6',"mno");
        val.put('7',"pqrs");
        val.put('8',"tuv");
        val.put('9',"wxyz");
        solve(0,digits,res,str,val);
        return res;
    }
}