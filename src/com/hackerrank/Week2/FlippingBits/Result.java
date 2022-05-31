package com.hackerrank.Week2.FlippingBits;

public class Result {
    public static long flippingBits(long n) {
       String binary = String.format("%32s", Long.toBinaryString(n)).replaceAll(" ", "0");
       StringBuilder sb = new StringBuilder();
       for(int i = 0; i < binary.length(); i++) {
           if (binary.charAt(i) == '1') {
               sb.append("0");
           } else {
               sb.append("1");
           }
       }
       return Long.parseLong(sb.toString(), 2);
    }

}
