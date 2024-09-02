import java.io.*;
import java.util.*;

public class minelement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size of an array element...");
        
        // Read the size of the array
        int size = scanner.nextInt();
        
        // Initialize the array
        int[] arr = new int[size];
        
        // Read the elements of the array
        System.out.println("The array element...");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Find the minimum value in the array
        int minValue = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        
        // Print the minimum value
        System.out.println("Final minimum element are...");
        System.out.println(minValue);
    }
}