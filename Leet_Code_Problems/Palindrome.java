package Leet_Code_Problems;

public class Palindrome {
    public boolean isPalindrome(int x) {
        int revno = 0;
        int dup = x;
        while(x>0){
            int ld = x % 10;
            revno = (revno * 10)+ ld;
            x =x/10;
        }
        if(dup == (revno)){
            return true;
        }
        else{
            return false;
        }
    }
}

