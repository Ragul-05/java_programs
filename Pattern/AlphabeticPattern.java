package Pattern;

import java.util.Scanner;

public class AlphabeticPattern {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();

    for(int i = 0;i < n; i ++){
        for(char ch ='A'; ch <= 'A'+i;ch++){
            System.out.print(ch);
        }
        System.out.println();
    }
    
}
}
