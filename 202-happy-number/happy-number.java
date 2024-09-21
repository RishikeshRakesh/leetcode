class Solution {
    public boolean isHappy(int n) {
        int val=0;
        int num=0;
        int sum=1;
         HashSet<Integer> set= new HashSet<>();
        
        while(n!=1 && !set.contains(n))
        {
            set.add(n);
            sum=0;
            while(n>0){
            val=n%10;
            sum+=val*val;
            n=n/10;
            }
            n=sum;
        }   
     
      return n==1;  
    }
}