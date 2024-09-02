import java.util.Scanner;
public class revstr {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();

        // Initialize an empty string to store the reversed string
        String reversedString = "";

        // Loop through the original string from the last character to the first
        for (int i = originalString.length() - 1; i >= 0; i--) {
            // Add each character to the reversedString
            reversedString += originalString.charAt(i);
        }

        // Print the reversed string
        System.out.println("Reversed string: " + reversedString);

        if (originalString.equals(reversedString) ){
            System.out.println("It is a Palindrome");
        }
        else{
            System.out.println("It is not a Palindrome");
        }

        // Close the scanner
        scanner.close();
    }
}


