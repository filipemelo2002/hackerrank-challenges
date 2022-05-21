package com.hackerrank.Week1.CamelCase4;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner=  new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] split = line.split(";");
            String operator = split[0];
            String type = split[1];
            String word = split[2];

            StringBuilder output = new StringBuilder();


            if (operator.equalsIgnoreCase("s")) {

                for (char c : word.toCharArray()) {
                    if (Character.isUpperCase(c)) {
                        output.append(" ").append(c);
                    } else {
                        output.append(c);
                    }
                }
                output = new StringBuilder(output.toString().replace("()","").toLowerCase(Locale.ROOT));
            }

            if (operator.equalsIgnoreCase("c")) {
                String[] words = word.split(" ");


                for (int i =0; i < words.length; i++) {
                    String w  = words[i];
                    String capitalized = w.substring(0, 1).toUpperCase() + w.substring(1);

                    if (type.equalsIgnoreCase("c")){
                        output.append(capitalized);
                    } 
                    
                    if (type.equalsIgnoreCase("m")) {
                        if (i > 0) {
                            output.append(capitalized);
                        } else {
                            output.append(w);
                        }

                        if (i == words.length - 1) {
                            output.append("()");
                        }
                    }

                    if (type.equalsIgnoreCase("v")) {
                        if (i > 0) {
                            output.append(capitalized);
                        } else {
                            output.append(w);
                        }
                    }
                }
            }
            System.out.println(output.toString().trim());
        }
    }
}