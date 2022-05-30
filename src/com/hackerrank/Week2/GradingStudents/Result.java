package com.hackerrank.Week2.GradingStudents;

import java.util.List;

public class Result {

    public static List<Integer> gradingStudents(List<Integer> grades) {

        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) > 37) {
                int distanceFromMultiple = 1, currentValue = grades.get(i);
                while ((currentValue+distanceFromMultiple)%5 != 0) {
                    distanceFromMultiple++;
                }
                if (distanceFromMultiple < 3) {
                    grades.set(i, currentValue+distanceFromMultiple);
                }
            }
        }
        return grades;
    }

}
