package Arrays.Sorted;

// Java program to delete an 
// element from a sorted array 

class Delete { 

	// Binary search 
	static int binarySearch(int arr[], int low, int high, 
							int key) 
	{ 
		if (high < low) 
			return -1; 
		int mid = (low + high) / 2; 
		if (key == arr[mid]) 
			return mid; 
		if (key > arr[mid]) 
			return binarySearch(arr, (mid + 1), high, key); 
		return binarySearch(arr, low, (mid - 1), key); 
	} 

	/* Function to delete an element */
	static int deleteElement(int arr[], int n, int key) 
	{ 
		// Find position of element to be deleted 
		int pos = binarySearch(arr, 0, n - 1, key); 

		if (pos == -1) { 
			System.out.println("Element not found"); 
			return n; 
		} 

		// Deleting element 
		int i; 
		for (i = pos; i < n - 1; i++) 
			arr[i] = arr[i + 1]; 

		return n - 1; 
	} 

	/* Driver Code */
	public static void main(String[] args) 
	{ 

		int i; 
		int arr[] = { 10, 20, 30, 40, 50 }; 

		int n = arr.length; 
		int key = 30; 

		System.out.print("Array before deletion:\n"); 
		for (i = 0; i < n; i++) 
			System.out.print(arr[i] + " "); 

		// Function call 
		n = deleteElement(arr, n, key); 

		System.out.print("\n\nArray after deletion:\n"); 
		for (i = 0; i < n; i++) 
			System.out.print(arr[i] + " "); 
	} 
}

