package sample.Data_Structure.Recursion;

public class PrintingNtimes {
    static void func(int i, int n) {
        if(i > n) return;
        System.out.println("Raj");
        func(i + 1, n);
    }

    public static void main(String[] args) {
        int n = 4;
        func(1, n);
    }
}

