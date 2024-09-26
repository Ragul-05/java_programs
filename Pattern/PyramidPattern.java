package Pattern;

import java.util.Scanner;


public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}
