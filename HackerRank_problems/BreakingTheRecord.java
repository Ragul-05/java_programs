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
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
     int maxscore = 0;
        int minscore = 0;
        
        // Set initial max and min to the first score
        int maxvalue = scores.get(0);
        int minvalue = scores.get(0);

        // Iterate through the scores starting from the second element
        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i) > maxvalue) {
                maxvalue = scores.get(i); // Update max value
                maxscore++; // Increment max record break counter
            }
            if (scores.get(i) < minvalue) {
                minvalue = scores.get(i); // Update min value
                minscore++; // Increment min record break counter
            }
        }

        // Return the result as a list containing both maxscore and minscore
        List<Integer> result = new ArrayList<>();
        result.add(maxscore);
        result.add(minscore);
        return result;

    }

}


public class BreakingTheRecord{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] scoresTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> scores = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresTemp[i]);
            scores.add(scoresItem);
        }

        List<Integer> result = Result.breakingRecords(scores);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

