import java.util.*;
public class largestnoinarr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = scanner.nextInt();
        System.out.print("Enter the element in array:");
        int[] arr = new int[n];
        for (int i = 0; i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i<n;i++){
            
            if(max<arr[i]){
                max =arr[i];
            }
            else{
                continue;
            }
         }
         System.out.print("The largest element is:" +max);
        

    }
}
