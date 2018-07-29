package com.learning.Statistics;

import java.util.Arrays;

public class Median {

    public static double calculateMedian(int[] tab) {
        Arrays.sort(tab);
        if(tab.length%2==0)
            return ((double)(tab[tab.length / 2-1] + tab[tab.length / 2])) / 2;
        else
            return (tab[tab.length / 2]);
    }

}
