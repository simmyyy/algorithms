package com.learning.Algorithms;

public class LargestSumContiguousSubarray {

    public static long calculateMaxContiguousSum(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null.");
        }
        long sum = 0;
        long max = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum < 0) {
                sum = 0;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

}
