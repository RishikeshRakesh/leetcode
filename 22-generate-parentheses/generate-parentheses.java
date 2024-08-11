class Solution {
      public void solve(int n,String str,int o,int c,List<String> list){
         if(c==n && o==n){
            list.add(str);
            return;
         }
         else{
            if(n>o){
                solve(n,str+"(",o+1,c,list);
            }
            if(c<o){

                solve(n,str+")",o,c+1,list);
            }
         }
         }
public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        String str="";
        solve(n,str,0,0,list);
        return list;
    }
}