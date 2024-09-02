import java.util.Scanner;
public class productofno {
    public static void main(String args[]){
        System.out.println("Product of two numbers:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The given no are.."+n);
        int product=1;
        while(n!=0){
            int digit = n % 10;
            product*=digit;
            n/=10;
        }
        System.out.println(product);
    }
    
}
