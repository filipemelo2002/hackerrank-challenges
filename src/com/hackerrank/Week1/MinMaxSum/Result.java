package com.hackerrank.Week1.MinMaxSum;
import java.util.*;

class Result {

    public static void miniMaxSum(List<Integer> arr) {
        long minSum =0, maxSum =0;
        int auxIndex = 4;
        Collections.sort(arr);
        for (int i=0; i < 4; i++) {
            minSum+=arr.get(i);
            maxSum+=arr.get(auxIndex);
            auxIndex--;
        }

        System.out.printf("%d %d", minSum, maxSum);
    }

}

