package Arrays;

public class SortArray {
    
        public boolean check(int[] nums) {
        int countDecreases = 0;
            int n = nums.length;
            
            for (int i = 0; i < n; i++) {
                
                if (nums[i] > nums[(i + 1) % n]) {
                    countDecreases++;
                }
               
                if (countDecreases > 1) {
                    return false;
                }
            }
            return true;
    }
    }

