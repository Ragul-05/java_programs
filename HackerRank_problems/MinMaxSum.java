package HackerRank_problems;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
     Collections.sort(arr);

        // Calculate the minimum sum (sum of the first four elements)
        long minSum = 0;
        long maxSum = 0;
        
        for (int i = 0; i < 4; i++) {
            minSum += arr.get(i);
        }

        // Calculate the maximum sum (sum of the last four elements)
        for (int i = 1; i < 5; i++) {
            maxSum += arr.get(i);
        }

        // Print the results
        System.out.println(minSum + " " + maxSum);
    }

}

public class MinMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
