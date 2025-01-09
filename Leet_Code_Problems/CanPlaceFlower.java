package Leet_Code_Problems;

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;

        int size = flowerbed.length;

        for (int i = 0; i < size; i++) {
            if (flowerbed[i] == 0) {
                boolean isLeftEmpty = (i == 0 || flowerbed[i - 1] == 0);
                boolean isRightEmpty = (i == size - 1 || flowerbed[i + 1] == 0);

                if (isLeftEmpty && isRightEmpty) {
                    flowerbed[i] = 1;
                    n--;

                    if (n == 0) return true;
                }
            }
        }

        return n == 0;
    }
}
