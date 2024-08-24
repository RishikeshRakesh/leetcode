class Solution {
    public boolean lemonadeChange(int[] bills) {
        int ten=0;
        int five=0;
        for(int i=0;i<bills.length;i++){
               if(bills[i]==5){
                five++;
               }
               else if(bills[i]==10){
                  five--;
                  ten++;
               }
               else {
                if(ten>0){
                five--;
                ten--;
                }
                else{
                five-=3;}
               
         }
        
        if(0>ten || 0>five){
            return false;
        }
        }
        return true;
    }
}