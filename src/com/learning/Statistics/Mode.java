package com.learning.Statistics;

public class Mode {

    public static int calculateMode(int[] tab) {
        int[] temp = new int[100000];
        for (int i : tab) {
            temp[i]++;
        }
        int min = Integer.MIN_VALUE;
        int minValues = Integer.MAX_VALUE;
        for (int position = 0; position < temp.length; position++) {
            if (temp[position] >= min && temp[position]>0) {
                if(temp[position]==min){
                    if(position<minValues){
                        minValues = position;
                        min = temp[position];
                    }
                }
                else {
                    minValues = position;
                    min = temp[position];
                }

            }
        }
        return minValues;
    }

}
