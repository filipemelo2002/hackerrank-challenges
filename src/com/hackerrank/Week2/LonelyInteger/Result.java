package com.hackerrank.Week2.LonelyInteger;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Result {

    public static int lonelyinteger(List<Integer> a) {
        Set<Integer> set = new HashSet<>();
        for (int i : a) {
            if (set.contains(i)) {
                set.remove(i);
            } else {
                set.add(i);
            }
        }
        return set.iterator().next();
    }
}
