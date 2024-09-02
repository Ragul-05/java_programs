import java.io.*;
import java.util.*;
public class evencount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value:");
        int num = scanner.nextInt();
        
        int count = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                count++;
            }
            num /= 10;
        }
        
        System.out.print("Final count value of an even digit:"+count);
    }
}

