package Arrays;

public class Peakelement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 2, 23, 90, 67};
        int peak = findPeakElement(arr);
        if (peak != -1) {
            System.out.println("Peak element is " + arr[peak] + " at index " + peak);
        } else {
            System.out.println("No peak element found");
        }
    }

    public static int findPeakElement(int[] arr) {
        int n = arr.length;

        // Handle edge cases where the array length is 1 or 2
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return arr[0] >= arr[1] ? 0 : 1;
        }

        // Check if the first or last element is a peak
        if (arr[0] >= arr[1]) {
            return 0;
        }
        if (arr[n - 1] >= arr[n - 2]) {
            return n - 1;
        }

        // Check for peak in the rest of the array
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                return i;
            }
        }

        return -1; // If no peak element is found
    }
}