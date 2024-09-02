import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();  // Read the size for the pattern

        for (int i = 0; i < n+1; i++) {
            if (i == 0 || i == n ) {
                // Print the first and last rows filled with stars
                for (int j = 0; j < n; j++) {
                    System.out.print("*\t");
                }
                System.out.println();
            } else {
                // Print the middle rows with stars at the corners
                for (int j = 0; j < n+1; j++) {
                    if (j == 0 || j == n ) {
                        System.out.print("*");
                    } else {
                        System.out.print("\t");
                    }
                }
                System.out.println();
            }
        }
    }
}



/* 
* * * * *
*       *    
*       *
*       *
*       *
* * * * **/
