package Leet_Code_Problems;
import java.util.*;
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
       for (int i = 1; i < nums.length; i++) {
        if (nums[i] == 0 && nums[i - 1] == 0) {
            return true;
        }
    }

    Map<Integer, Integer> modMap = new HashMap<>();
    modMap.put(0, -1);
    int sum = 0;

    for (int i = 0; i < nums.length; i++) {
        sum += nums[i];
        int mod = (sum % k + k) % k; 

        if (modMap.containsKey(mod)) {
            if (i - modMap.get(mod) > 1) {
                return true;
            }
        } else {
            modMap.put(mod, i);
        }
    }
    return false;
}
}