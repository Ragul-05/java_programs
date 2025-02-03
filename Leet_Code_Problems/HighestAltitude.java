package Leet_Code_Problems;

class Solution {
    public int largestAltitude(int[] gain) {
        int total = 0;
        int high = 0;
        for(int i = 0 ; i < gain.length; i++){
            total += gain[i];
            high = Math.max(high,total);
        }
        return high;
    }
}