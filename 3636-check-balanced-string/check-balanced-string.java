class Solution {
    public boolean isBalanced(String num) {
        int sum=0;
        int sum1=0;
        for(int i=0;i<num.length();i++){
            String s=num.charAt(i)+"";
            int n=Integer.parseInt(s);
            if(i%2==0){
                sum+=n;
            }
            else{
                sum1+=n;
            }
        }
        return sum==sum1;
    }
}