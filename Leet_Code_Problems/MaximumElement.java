package Leet_Code_Problems;
import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        int element = nums[0];
        int count = 1;

       
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == element) {
                count++;
            } else {
                count--;
            }
            
            if (count == 0) {
                element = nums[i];
                count = 1;
            }
        }

        
        return element;
    }
}

public class MaximumElement{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<nums.length-1;i++){
            nums[i] = sc.nextInt();
        }
        Solution solution = new Solution(); 
        int num = solution.majorityElement(nums);
        System.out.println( + num);
   
