package Leet_Code_Problems;

class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxi = nums[0]; 
        int sum = 0; 
        
        for (int i = 0; i < n; i++) {
            sum += nums[i]; 
            maxi = Math.max(maxi, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxi;
    }
}