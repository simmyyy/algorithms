package com.learning.DynamicProgramming;


import java.util.Arrays;
import java.util.Comparator;

public class Equal {

    //https://www.hackerrank.com/challenges/equal/problem
    public static int equal(int[] arr) {
        Arrays.sort(arr);
        int totalSumOperations = 0;
        int consAdd = 0;
        for (int i = 1; i < arr.length; i++) {
            int res = (arr[i] + consAdd) - arr[i - 1];
            consAdd = res;
            if (res > 0) {
                int sumOperations = res / 5;
                sumOperations += sumOperations / 3;
                sumOperations += sumOperations / 1;
                totalSumOperations = sumOperations;
            }
        }
        return totalSumOperations;
    }

}
