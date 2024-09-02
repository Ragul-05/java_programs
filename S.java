/*import java.io.*;
import java.util.*;

public class pattern {

    public static void main(String[] args) {
           String[] letters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 0; i< n;i++)
        {
            for(int j =0 ; j < n - i; j++)
            {
                System.out.print(letters[j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

 
} */


//1. Square Hollow Pattern
/*import java.util.*;
 
public class pattern {
    // Function to demonstrate pattern
    public static void printPattern(int n)
    {
        int i, j;
        // outer loop to handle number of rows
        for (i = 0; i < n; i++) {
            //  inner loop to handle number of columns
            for (j = 0; j < n; j++) {
                // star will print only when  it is in first
                // row or last row or first column or last
                // column
                if (i == 0 || j == 0 || i == n - 1
                    || j == n - 1) {
                    System.out.print("*");
                }
                // otherwise print space only.
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
 
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}*/



//2. Number triangle Pattern

// Java Program to print pattern
// Number triangle pattern
/*import java.util.*;

public class pattern {
	// Function to demonstrate pattern
	public static void printPattern(int n)
	{
		int i, j;
		// outer loop to handle number of rows
		for (i = 1; i <= n; i++) {
			// inner loop to print space
			for (j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			// inner loop to print star
			for (j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			// print new line for each row
			System.out.println();
		}
	}

	// Driver Function
	public static void main(String args[])
	{
		int n = 6;
		printPattern(n);
	}
}*/


//3. Number-increasing Pyramid Pattern 

// Java Program to print pattern
// Number-increasing pyramid 
/*import java.util.*;

public class pattern {
	// Function to demonstrate pattern
	public static void printPattern(int n)
	{
		int i, j;
		// outer loop to handle number of rows
		for (i = 1; i <= n; i++) {
			// inner loop to handle number of columns
			for (j = 1; j <= i; j++) {
				// printing column values upto the row
				// value.
				System.out.print(j + " ");
			}

			// print new line for each row
			System.out.println();
		}
	}

	// Driver Function
	public static void main(String args[])
	{
		int n = 6;
		printPattern(n);
	}
}*/

//4. Number-increasing reverse Pyramid Pattern


/*import java.util.*;

public class pattern {
	// Function to demonstrate pattern
	public static void printPattern(int n)
	{
		int i, j;
		// outer loop to handle number of rows
		for (i = 1; i <= n; i++) {
			// inner loop to handle number of columns
			for (j = 1; j <= n-i+1; j++) {
				// printing column values upto the row
				// value.
				System.out.print(j + " ");
			}

			// print new line for each row
			System.out.println();
		}
	}

	// Driver Function
	public static void main(String args[])
	{
		int n = 6;
		printPattern(n);
	}
}*/

//5. Number-changing Pyramid Pattern
// Java Program to print pattern
// Number-changing pyramid
/*import java.util.*;

// Java code for printing pattern
public class pattern {
	// Function to demonstrate pattern
	public static void printPattern(int n)
	{
		int i, j;
		int num = 1;
		// outer loop to handle number of rows
		for (i = 1; i <= n; i++) {
			// inner loop to handle number of columns
			for (j = 1; j <= i; j++) {
				// printing value of num in each iteration.
				System.out.print(num + " ");
				// increasing the value of num.
				num++;
			}

			// printing new line for each row
			System.out.println();
		}
	}

	// Driver Function
	public static void main(String args[])
	{
		int n = 6;
		printPattern(n);
	}
}*/


//6. Zero-One Triangle Pattern
// Java Program to print pattern
// Zero-One triangle
/*import java.util.*;

public class pattern {
	// Function to demonstrate pattern
	public static void printPattern(int n)
	{
		int i, j;
		//outer loop to handle number of rows
		for (i = 1; i <= n; i++) {
			//inner loop to handle number of columns
			for (j = 1; j <= i; j++) {
				// if the sum of (i+j) is even then print 1
				if ((i + j) % 2 == 0) {
					System.out.print(1 + " ");
				}
				// otherwise print 0
				else {
					System.out.print(0 + " ");
				}
			}

			//printing new line for each row
			System.out.println();
		}
	}

	// Driver Function
	public static void main(String args[])
	{
		int n = 6;
		printPattern(n);
	}
}*/

//7. Palindrome Triangle Pattern
// Java Program to print pattern
// Palindrome triangle
/*import java.util.*;

public class pattern {
	// Function to demonstrate pattern
	public static void printPattern(int n)
	{
		int i, j;

		// outer loop to handle number of rows
		for (i = 1; i <= n; i++) {
			// inner loop to print the spaces
			for (j = 1; j <= 2 * (n - i); j++) {
				System.out.print(" ");
			}

			// inner loop to print the first part
			for (j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}

			// inner loop to print the second part
			for (j = 2; j <= i; j++) {
				System.out.print(j + " ");
			}

			// printing new line for each row
			System.out.println();
		}
	}

	// Driver Function
	public static void main(String args[])
	{
		int n = 6;
		printPattern(n);
	}
}*/

//8. Rhombus Pattern

/* 
import java.util.*;
public class pattern{
	public static void patternprint(int n){
		int i,j;
		for(i=1;i<n;i++){
			for(j=1;j<n-i;j++){
				System.out.print(" ");
			}
			for(j=1;j<n+1;j++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

public static void main(String args[]){
	int n=6;
	patternprint(n);
}
}*/

//9. Diamond Star Pattern
// Java Program to print
// Diamond Star Pattern
/*import java.util.*;

public class pattern {

	// Function to demonstrate pattern
	public static void printPattern(int n)
	{
		int i, j;
		int num = 1;
		// outer loop to handle upper part
		for (i = 1; i <= n; i++) {
			// inner loop to print spaces
			for (j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			// inner loop to print stars
			for (j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// outer loop to handle lower part
		for (i = n-1; i >= 1; i--) {
			// inner loop to print spaces
			for (j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			// inner loop to print stars
			for (j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// Driver Function
	public static void main(String args[])
	{
		int n = 6;
		printPattern(n);
	}
}*/

//10. Butterfly Star Pattern

// Java Program to print
// Butterfly Pattern
import java.util.*;

// Java code for printing pattern
public class S {

	// Function to demonstrate pattern
	public static void printPattern(int n)
	{
		int i, j;
		int num = 1;

		// outer loop to handle upper part
		for (i = 1; i <= n; i++) {
			// inner loop to print stars
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}

			// inner loop to print spaces
			int spaces = 2 * (n - i);
			for (j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}

			// inner loop to print stars
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		// outer loop to handle lower part
		for (i = n; i >= 1; i--) {
			// inner loop to print stars
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}

			// inner loop to print spaces
			int spaces = 2 * (n - i);
			for (j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}

			// inner loop to print stars
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	// Driver Function
	public static void main(String args[])
	{
		int n = 6;
		printPattern(n);
	}
}


