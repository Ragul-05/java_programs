package Leet_Code_Problems;
import java.util.*;
class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1))) {
                res += romanMap.get(s.charAt(i + 1)) - romanMap.get(s.charAt(i));
                i++;
            }
            else {
                res += romanMap.get(s.charAt(i));
            }
        }

        return res;
    }
}