package Data_Structure.Recursion;

public class Fibonacci {
    static int fibonacci(int N) {
        
        if (N <= 1) {
            return N;
        }
        int last = fibonacci(N - 1);
        int slast = fibonacci(N - 2);

        return last + slast;
    }

    public static void main(String[] args) {
        
        int N = 4;
        
        for(int i =0;i<=N;i++){
            System.out.println(fibonacci(N-i));
        }
    }
}

