package Data_Structure.Sorting;

import java.util.*;

public class Insertion_Sort {
    static void insertion_sort(int[] arr, int n) {
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        System.out.println("After insertion sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("The size of an array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of an array :");
        for(int i=0 ;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        insertion_sort(arr, n);
    }
}