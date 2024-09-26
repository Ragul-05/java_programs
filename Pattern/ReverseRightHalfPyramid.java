package Pattern;

import java.util.Scanner;

public class ReverseRightHalfPyramid {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    // we can use other condition also in the for (j=0;j<n-i+1;j++) it wprks for the same logic
    for(int i = 1;i <= n; i ++){
        for(int j = n; j >= i ;j--){ 
            System.out.print("*");
        }
        System.out.println();
    }
    
    }
}
