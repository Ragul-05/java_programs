package HackerRank_problems;

import java.io.*;
import java.math.*;
import java.util.*;

class Result {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int d1 = 0, d2 = 0;
        int n = arr.size();

        for (int i = 0; i < n; i++) {
            d1 += arr.get(i).get(i); // Sum of primary diagonal
            d2 += arr.get(i).get(n - i - 1); // Sum of secondary diagonal
        }

        // Absolute difference of the sums across the diagonals
        return Math.abs(d1 - d2);
    }
}

public class DiagonalDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().trim().split(" ");
            List<Integer> arrRowItems = new ArrayList<>();
            for (String item : arrRowTempItems) {
                arrRowItems.add(Integer.parseInt(item));
            }
            arr.add(arrRowItems);
        }

        int result = Result.diagonalDifference(arr);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
