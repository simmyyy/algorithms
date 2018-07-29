package com.learning.Statistics;

public class WeightenedMean {

    public static double WeightenedMean(int[] numbers, int[] means) {
        int numbersSum = 0;
        int meansSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbersSum += (means[i] * numbers[i]);
            meansSum += means[i];
        }
        return ((double) numbersSum) / meansSum;
    }

}
