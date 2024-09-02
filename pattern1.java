/*import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input
        int n = scanner.nextInt();
        
        // Generate the pattern
        generatePattern(n);
    }
    
    public static void generatePattern(int n) {
        // Loop for upper half of the pattern
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print first star
            System.out.print("*");
            
            // Print middle spaces
            for (int j = 0; j < 2 * (n - i - 1) - 1; j++) {
                System.out.print(" ");
            }
            
            // Print second star (except for the last row)
            if (i != n - 1) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
        
        // Loop for lower half of the pattern
        for (int i = n - 2; i >= 0; i--) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print first star
            System.out.print("*");
            
            // Print middle spaces
            for (int j = 0; j < 2 * (n - i - 1) - 1; j++) {
                System.out.print(" ");
            }
            
            // Print second star
            System.out.print("*");
            // Move to the next line
            System.out.println();
        }
    }
}*/

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input
        int n = scanner.nextInt();

        for (int i =1;i<n+1;i++){
            for(int j=1;j<i+1;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}