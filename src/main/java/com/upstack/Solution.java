package com.upstack;

public class Solution {

    public String formatString(int[] input) {
        if (input.length == 0) {
            return "";
        }
        String result =  visit(input, 0, input.length - 1);
        return result.trim();
    }

    private String visit(int[] input, int start, int end) {
        int pivot = (start + end) / 2;
        int count = 1;
        String leftResult = "";
        String rightResult = "";
        int i = pivot + 1;
        int j = pivot - 1;
        while (true) {
            if ((i > end || input[pivot] != input[i]) && (j < start || input[pivot] != input[j])) {
                break;
            }
            if (i <= end && input[pivot] == input[i]) {
                count++;
                i++;
            }
            if (j >= start && input[pivot] == input[j]) {
                count++;
                j--;
            }
        }
        if (j >= start) {
            leftResult = visit(input, start, j);
        }
        if (i <= end) {
            rightResult = visit(input, i, end);
        }
        String result = leftResult + (count > 1 ? " " + input[pivot] + " FOR " + count : " " + input[pivot]) + rightResult;
        return result;
    }

}
