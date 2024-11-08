package java_basics;
import java.util.*;
class Calculator {
 
    public int multiply(int n1, int n2){
        int r = n1 * n2;
        return r;
    }
    public int add(int n1, int n2){
        int r = n1 + n2;
        return r;
    }
    public int sub(int n1, int n2){
        int r = n1 - n2;
        return r;
    }
    public int div(int n1, int n2){
        int r = n1 / n2;
        return r;
    }
}

public class ClassAndObject{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice:");
        int n = sc.nextInt();
        int num1,num2;
        System.out.print("Enter the number 1:");
        num1 = sc.nextInt();  
        
        System.out.print("Enter the number 2:");
        num2 = sc.nextInt();
        Calculator calc = new Calculator();

        switch (n) {
            case 1:
                int r = calc.add(num1,num2);
                System.out.println("Addition :" + r);
                break;
            case 2:
                int s = calc.sub(num1,num2);
                System.out.println("Subtraction :" + s);
                break;
            case 3:
                int t = calc.multiply(num1,num2);
                System.out.println("Multiply :" + t);
                break;
            case 4:
                int u = calc.div(num1,num2);
                System.out.println("Division :" + u);
                break;
            default:
                break;
        }
       
       
        
    }
}
