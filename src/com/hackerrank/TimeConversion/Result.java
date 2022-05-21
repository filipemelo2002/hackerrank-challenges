package com.hackerrank.TimeConversion;

public class Result {


    public static String timeConversion(String s) {
        String timeSuffix = s.substring(Math.max(s.length() - 2, 0));
        String time = s.substring(0, s.length() - 2);
        String[] timeParts = time.split(":");
        int integerHour = Integer.parseInt(timeParts[0]);

        if (timeSuffix.equalsIgnoreCase("am")) {

            if (integerHour == 12) {
                timeParts[0] = "00";
            }

            return String.join(":", timeParts);
        }

        if(timeSuffix.equalsIgnoreCase("pm") && integerHour == 12) {
            return String.join(":", timeParts);
        }

        integerHour += 12;
        timeParts[0] = Integer.toString(integerHour);

        return String.join(":", timeParts);
    }


}
