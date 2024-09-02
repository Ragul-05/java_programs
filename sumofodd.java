import java.util.*;
public class sumofodd {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++){
            if (n % 2!=0){
                sum +=n;
            }
        }

        System.out.println("Finally,the odd sum is :"+ sum);
    }
}
