package com.hackerrank.DivisbleSumPairs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Result {

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int count = 0;
        Collections.sort(ar);

        for (int i =0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if ((ar.get(i) + ar.get(j)) % k == 0 && ar.get(j) >= ar.get(i)) {
                    count++;
                }

            }
        }

        return count;
    }

}
