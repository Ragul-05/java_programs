package Leet_Code_Problems;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < (word1.length() > word2.length() ? word1.length() : word2.length()); i++){
            if(i < word1.length())
                result.append(word1.charAt(i));
            if(i < word2.length())
                result.append(word2.charAt(i));
        }

        return result.toString();
    }
}