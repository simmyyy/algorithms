package com.learning.Statistics;

import java.util.Arrays;

public class Mean {

    public static double calculateMean(int[] tab){
        double sum = 0;
        for(int i : tab){
            sum+=i;
        }
        return sum/tab.length;
    }

}
