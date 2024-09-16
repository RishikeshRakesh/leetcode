class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int val=arrivalTime + delayedTime;
        int ans=0;
        if(val<=23){
            return val;
        }
        
        else
        ans=val%24;
        return ans;
    }
}