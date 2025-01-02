package Leet_Code_Problems;


class Solution {
    public int countOdds(int low, int high) {
       int nums = high - low + 1;

       if(high %2 != 0 && low %2 !=0){
          return (nums/2)+1;
       } 
       else{
          return (nums/2);
       }
    }
}