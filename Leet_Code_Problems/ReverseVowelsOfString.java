package Leet_Code_Problems;
import java.util.*;

class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left =0, right=arr.length -1;

        while(left<right){
            while(left<right && !isvowel(arr[left])){
                left++;
            }
             while(left<right && !isvowel(arr[right])){
                right--;
            }
            if(left<right){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
     private boolean isvowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
