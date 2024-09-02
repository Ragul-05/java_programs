import java.util.*;
public class fact {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int fact = 1;
        if (n<0){
            System.out.println("Cannot Evaluate...");
        }

        else {
            
            for (int i = 1; i<n+1; i++){
                fact = fact * i;
            }
            System.out.println("Finally the factorial of a number "+n+" is "+fact);
        }
        
    }
}
