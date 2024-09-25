
import java.util.*;
public class sumofprev {

    public static void sumofarr(int arr[],int n){
        int [] arr2 = new int[n];
        int sum = 0;
        for(int i = 0;i<arr2.length;i++){
            arr2[i] = sum + arr[i];
            sum+=arr[i];
        }
        System.out.print("Final added array :");
        for(int i = 0;i<arr2.length;i++){
            System.out.print(" "+arr2[i]+" "); 
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the Array elements:");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        sumofarr(arr,n);
        
    }
}
