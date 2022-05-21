package com.hackerrank.SparseArrays;

import java.util.ArrayList;
import java.util.List;

public class Result {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> results = new ArrayList<>(queries.size());

        for (int i =0; i < queries.size(); i++) {
            results.add(0);
        }

        for (int i =0; i < queries.size(); i++) {
           for (String string : strings) {
               if (string.equals(queries.get(i))) {
                   results.set(i, results.get(i) + 1);
               }
           }
        }

        return results;
    }
}
