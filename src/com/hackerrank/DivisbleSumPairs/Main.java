package com.hackerrank.DivisbleSumPairs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();

        String[] arr1 = line1.split(" ");

        int n = Integer.parseInt(arr1[0]);
        int k = Integer.parseInt(arr1[1]);

        String[] arr2 = line2.split(" ");
        List<Integer> list = new ArrayList<>();
        for (String value : arr2)   {
            list.add(Integer.parseInt(value));
        }

        int result = Result.divisibleSumPairs(n, k, list);


        System.out.println(result);
    }
}
