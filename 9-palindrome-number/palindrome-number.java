import java.util.*;
class Solution {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        if(isPalindrome(b)){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }


    }
    public static boolean isPalindrome(int x) {
     if(x<0){
        return false;
     }
     int original=x;
        int digit=0;
        int sum=0;
        while(x>0){
            digit=x%10;
            sum=sum*10+digit;
            x/=10;
            }
            return original==sum;
    }
     

}