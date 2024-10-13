package Data_Structure.Recursion;

public class Sumof_N_numbers {
    static void func(int i, int sum) {
        if(i < 1) {
            System.out.println(sum);
            return;
        }
        func(i - 1, sum + i);
    }

    public static void main(String[] args) {
        int n = 3;
        func(n, 0);
    }
}

