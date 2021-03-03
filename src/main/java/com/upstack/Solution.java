package com.upstack;

public class Solution {

    public static String formatString(int[] input) {
        int curr = input[0];
        int counter = 1;
        StringBuilder result = new StringBuilder();
        result.append(curr + " ");
        for (int i=1; i < input.length; i++) {
            if (curr == input[i]) {
                counter++;
            } else {
                curr = input[i];
                if (counter > 1) {
                    result.append("FOR ").append(counter + " ");
                }
                result.append(curr + " ");
                counter = 1;
            }
        }
        if (counter > 1) {
            result.append("FOR ").append(counter);
        }
        return result.toString().trim();
    }

}
