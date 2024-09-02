package Arrays;
import java.util.Stack;
import java.util.Scanner;

public class ReverseArrayUsingStack {
    public static void reverseArrayUsingStack(int[] arr)
    {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        for (int element : arr) {
            stack.push(element);
        }

        // Pop elements from the stack to reverse the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public static void main(String[] args)
    {
        int[] arr = new int[5];
        System.out.println("Enter the elements in an array:");
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 5 ; i ++){
            arr[i] = sc . nextInt();
        }

        reverseArrayUsingStack(arr);

        System.out.print("Reversed Array: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
