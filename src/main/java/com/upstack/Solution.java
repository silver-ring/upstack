package com.upstack;

public class Solution {
    
    public static String formatString(int[] input) {
        String result = "";
        for (int i=0; i < input.length; i++) {
            int count = 1;
            while (i + 1 < input.length && input[i] == input[i + 1]) {
                i++;
                count++;
            }
            result +=  count > 1 ? " " + input[i] + " FOR " + count: " " + input[i];
        }
        return result.trim();
    }

}
