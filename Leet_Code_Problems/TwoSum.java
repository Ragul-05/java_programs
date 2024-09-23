package Leet_Code_Problems;

import java.util.Scanner;

public class TwoSum {

    
    public static int[] findFirstAndLast(int[] nums, int target) {
        int first = -1;  
        int last = -1;   
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (first == -1) {
                    first = i;  
                }
                last = i;  
            }
        }
        
        return new int[]{first, last};  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the target value: ");
        int target = sc.nextInt();
        int[] result = findFirstAndLast(nums, target);
        System.out.println("First occurrence: " + result[0]);
        System.out.println("Last occurrence: " + result[1]);
    }
}
