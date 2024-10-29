package Data_Structure.Sorting;
import java.util.*;
public class Selection_Sort {
    static void selection_sort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            //swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        System.out.println("After selection sort:");
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
        selection_sort(arr, n);
    }
}