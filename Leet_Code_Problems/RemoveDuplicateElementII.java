package Leet_Code_Problems;

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 3) return nums.length;
        int num = 2;
        for(int i = 2;i<nums.length;i++){
            if(nums[i]!=nums[num-2]){
                nums[num++] = nums[i];
            }
        }
        return num;
    }
}