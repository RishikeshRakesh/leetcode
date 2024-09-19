class Solution {
    public boolean squareIsWhite(String coordinates) {
        int val=(coordinates.charAt(0) - 98)  +  (Character.getNumericValue(coordinates.charAt(1)));
        if(val%2!=0){
            return true;
        }
        else{
            return false;
        }
    }
}