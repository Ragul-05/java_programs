package Leet_Code_Problems;

public class ReverseInteger {
    public int reverse(int x) {
        int revno = 0;
        
        
        while (x != 0) {  
            int lastdigit = x % 10;
            x = x / 10;
            
            
            if (revno > Integer.MAX_VALUE / 10 || (revno == Integer.MAX_VALUE / 10 && lastdigit > 7)) {
                return 0;
            }
            if (revno < Integer.MIN_VALUE / 10 || (revno == Integer.MIN_VALUE / 10 && lastdigit < -8)) {
                return 0;
            }
            
            revno = (revno * 10) + lastdigit;
        }
        
        return revno;
    }
}

