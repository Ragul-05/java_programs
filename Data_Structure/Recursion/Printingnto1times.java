package Data_Structure.Recursion;

public class Printingnto1times {
    static void func(int i, int n) {
        if(i < 1) return;
        System.out.println(i);
        func(i - 1, n);
    }

    public static void main(String[] args) {
        int n = 4;
        func(n, n);
    }
}

