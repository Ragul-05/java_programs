package Leet_Code_Problems;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = 1;
        right[n-1] = 1;

        for(int i=1;i<n;i++){
            left[i] = left[i-1] * nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            right[i] = right[i+1] * nums[i+1];
        }
        for(int i=0;i<n;i++){
            if(i==0) nums[i] =right[i];
            else if (i == n-1) nums[i] =left[i];
            else nums[i] = left[i] * right[i];
        }
        return nums;
    }
}