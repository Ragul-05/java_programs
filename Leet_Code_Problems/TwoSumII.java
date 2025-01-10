package Leet_Code_Problems;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lft = 0;
        int ryt = numbers.length-1;

        while(lft < ryt){
            int sum = numbers[lft] + numbers[ryt];
            if(sum == target){
                return new int[] {lft+1,ryt+1};
            }
            else if(sum < target){
                lft++;
            }
            else{
                ryt--;
            }
        }
        return new int[] {-1,-1};
    }
}
