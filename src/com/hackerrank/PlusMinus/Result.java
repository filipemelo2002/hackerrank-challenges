package com.hackerrank.PlusMinus;

import java.util.*;

class Result {

    public static void plusMinus(List<Integer> arr) {
        Double positive=0.0, negative=0.0, zeros=0.0;
        int length = arr.size();

        for (int value : arr) {
            if (value < 0) {
                negative++;
            }

            if (value > 0) {
                positive++;
            }

            if (value == 0) {
                zeros++;
            }
        }

        System.out.printf("%.6f\n", (positive/length));
        System.out.printf("%.6f\n", (negative/length));
        System.out.printf("%.6f", (zeros/length));

    }

}