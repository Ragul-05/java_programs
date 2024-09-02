import java.io.*;
import java.util.*;

public class reverseno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = scanner.nextInt();

        int reversedNum = 0;
        // Loop through each digit of the number
        while (num != 0) {
            int digit = num % 10;
            // If the digit is even, add it to the reversed number
            if (digit % 2 == 0) {
                reversedNum = reversedNum * 10 + digit;
            }
            num /= 10;
        }

        System.out.println(reversedNum);
    }
}