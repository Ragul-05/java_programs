import java.util.*;

public class oddno {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter the number:");
        int num = scanner.nextInt();
        // Variable to keep track of the position
        int position = 0;
        
        // Loop through each digit of the number
        while (num != 0) {
            // Get the last digit of the number
            int digit = num % 10;
            // Move to the next digit
            num /= 10;
            // Increment the position
            position++;
            // If the position is even and the digit is odd, print it
            if (position % 2 == 0 && digit % 2 != 0) {
                System.out.println(digit);
                // Since we found an odd digit in an even position, we can break the loop
                break;
            }
        }
        
        // If no odd digit was found in even positions, print 0
        if (num == 0 || position % 2 != 0) {
            System.out.println(0);
        }
    }
}