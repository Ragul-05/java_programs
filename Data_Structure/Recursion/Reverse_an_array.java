package Data_Structure.Recursion;

public class Reverse_an_array {
    static void printArray(int arr[], int n) {
        System.out.println("The reversed array is:- ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Function to reverse array using recursion
    static void reverseArray(int arr[], int start, int end) {
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArray(arr, start + 1, end - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 5, 4, 3, 2, 1 };
        reverseArray(arr, 0, n - 1);
        printArray(arr, n);
    }
}
