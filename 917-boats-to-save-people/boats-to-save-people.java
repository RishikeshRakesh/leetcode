class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int l=0;
        int r=people.length-1;
        int c=0;
        Arrays.sort(people);
        while(l<=r){
            if(people[l]+people[r]<=limit){
                    c++;
                    l++;
                    r--;
            }
            else{
                c++;
                
                r--;
            }
        }
        return c;
    }
}