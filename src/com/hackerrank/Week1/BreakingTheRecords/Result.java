package com.hackerrank.Week1.BreakingTheRecords;

import java.util.Arrays;
import java.util.List;

public class Result {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int min=scores.get(0), max=scores.get(0), minCount=0, maxCount = 0;


        for (int score : scores) {
            if (score < min) {
                min = score;
                minCount++;
            }

            if (score > max) {
                max = score;
                maxCount++;
            }

        }
        return Arrays.asList(maxCount, minCount);
    }
}