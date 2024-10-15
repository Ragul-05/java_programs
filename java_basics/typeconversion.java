package java_basics;

public class typeconversion {
    public static void main(String[] args) {
        byte b =127;
        int a = b;

        byte c = 123;
        float d =  c;

        int  f = 10;
        byte e = (byte)f;

        double g = 78.212346556767f;
        float h = (float)g;
    
        System.out.println(h);
    }
   
}
