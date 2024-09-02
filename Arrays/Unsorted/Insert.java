package Arrays.Unsorted;

// Java program to implement insert
// operation in an unsorted array.

class Insert {
	// Function to insert a given key in
	// the array. This function returns n+1
	// if insertion is successful, else n.
	static int insertSorted(int arr[], int n, int key,
							int capacity)
	{

		// Cannot insert more elements if n
		// is already more than or equal to
		// capacity
		if (n >= capacity)
			return n;

		arr[n] = key;

		return (n + 1);
	}

	// Driver Code
	public static void main(String[] args)
	{
		int[] arr = new int[20];
		arr[0] = 12;
		arr[1] = 16;
		arr[2] = 20;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 70;
		int capacity = 20;
		int n = 6;
		int i, key = 26;

		System.out.print("Before Insertion: ");
		for (i = 0; i < n; i++)
			System.out.print(arr[i] + " ");

		// Inserting key
		n = insertSorted(arr, n, key, capacity);

		System.out.print("\n After Insertion: ");
		for (i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}


//insert at any position

/*
import java.io.*;

// Java Program to Insert an element
// at a specific position in an Array
class GFG {
	static void insertElement(int arr[], int n, int x,
							int pos)
	{
		// shift elements to the right
		// which are on the right side of pos
		for (int i = n - 1; i >= pos; i--)
			arr[i + 1] = arr[i];
		arr[pos] = x;
	}
	public static void main(String[] args)
	{
		int arr[] = new int[15];
		arr[0] = 2;
		arr[1] = 4;
		arr[2] = 1;
		arr[3] = 8;
		arr[4] = 5;
		int n = 5;
		int x = 10, pos = 2;

		System.out.print("Before Insertion: ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");

		// Inserting key at specific position
		insertElement(arr, n, x, pos);
		n += 1;

		System.out.print("\n\nAfter Insertion: ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}

// This code is contributed by syedsarfarazahammed
 */