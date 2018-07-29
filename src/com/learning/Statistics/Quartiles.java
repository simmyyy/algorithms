package com.learning.Statistics;

import java.util.Arrays;
import static com.learning.Statistics.Median.*;

public class Quartiles {

    public static int[] calculateInterQuartiles(int[] numbers, int[] occurences){
        int max = 0;
        for(int occ : occurences)
            max+=occ;
        int temp[] = new int[max];
        int pos = 0;
        for(int i = 0;i<numbers.length;i++){
            for(int j =1;j<=occurences[i];j++){
                temp[pos] = numbers[i];
                pos++;
            }
        }
        Arrays.sort(temp);
        return calculateQuartiles(temp);
    }


    public static int[] calculateQuartiles(int[] numbers){
        int[] quartiles = new int[3];
        Arrays.sort(numbers);
        quartiles[1] = (int) calculateMedian(numbers);
        if(numbers.length%2==0){
            quartiles[0] = (int) calculateMedian(Arrays.copyOfRange(numbers,0,numbers.length/2));
            quartiles[2] = (int) calculateMedian(Arrays.copyOfRange(numbers,numbers.length/2,numbers.length));
        }
        else{
            quartiles[0] = (int) calculateMedian(Arrays.copyOfRange(numbers,0,numbers.length/2));
            quartiles[2] = (int) calculateMedian(Arrays.copyOfRange(numbers,numbers.length/2+1,numbers.length));
        }
        return quartiles;
    }

}
