package Leet_Code_Problems;
import java.util.*;

class Solution {
    public boolean canJump(int[] nums) {
        int track_count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > track_count) {
                return false; 
            }
            track_count = Math.max(track_count, i + nums[i]);
            if (track_count >= nums.length - 1) {
                return true; 
            }
        }
        return false;
    }
}

