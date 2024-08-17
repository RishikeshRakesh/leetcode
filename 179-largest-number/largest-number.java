class Solution {
    public String largestNumber(int[] nums) {
        // Convert integers to strings
        String[] numStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrs[i] = String.valueOf(nums[i]);
        }

        // Perform a bubble sort-like sorting with a custom comparator
        for (int i = 0; i < numStrs.length - 1; i++) {
            for (int j = i + 1; j < numStrs.length; j++) {
                // Compare concatenated results to determine order
                String order1 = numStrs[i] + numStrs[j];
                String order2 = numStrs[j] + numStrs[i];
                if (order2.compareTo(order1) > 0 ) {
                    // Swap numStrs[i] and numStrs[j]
                    String temp = numStrs[i];
                    numStrs[i] = numStrs[j];
                    numStrs[j] = temp;
                }
            }
        }

        // Handle edge case: if the largest number is "0", return "0"
        if (numStrs[0].equals("0")) {
            return "0";
        }

        // Concatenate sorted strings to form the largest number
        StringBuilder sb = new StringBuilder();
        for (String numStr : numStrs) {
            sb.append(numStr);
        }

        return sb.toString();
    }
}
