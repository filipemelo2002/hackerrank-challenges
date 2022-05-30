package com.hackerrank.Week1.Exam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Result {

    public static int findMedian(List<Integer> arr) {
       List<Integer> sortedList = arr.stream().sorted().collect(Collectors.toList());
        return sortedList.get(arr.size() / 2);
    }
}
