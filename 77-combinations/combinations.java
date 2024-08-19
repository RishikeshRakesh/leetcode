class Solution {
    public void solve(int k,int[] arr,int i,List<List<Integer>> res,List<Integer> val){
     if(i==arr.length){
             if(val.size()==k){
                res.add(new ArrayList<>(val));
             }
                  return;
     }
     else{
        val.add(arr[i]);
        solve(k,arr,i+1,res,val);
        val.remove(val.size()-1);
        solve(k,arr,i+1,res,val);
     }
} 
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> val=new ArrayList<>();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        solve(k,arr,0,res,val);
        return res;
     }
}