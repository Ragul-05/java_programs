package Leet_Code_Problems;

class Solution {
    public int[] rearrangeArray(int[] nums) {
       int n = nums.length;
        int[] result = new int[n];
        int posindex = 0, negindex = 1; 
        for (int num : nums) {
            if (num > 0) {
                if (posindex < n) {
                    result[posindex] = num;
                    posindex += 2; 
                }
            } else {
                if (negindex < n) {
                    result[negindex] = num;
                    negindex += 2; 
                }
            }
        }
        return result;
    }
}
