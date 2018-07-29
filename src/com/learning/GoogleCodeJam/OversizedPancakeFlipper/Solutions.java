package com.learning.GoogleCodeJam.OversizedPancakeFlipper;

import java.io.*;

public class Solutions {

    public static void pancakes() throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(new File("C:\\Users\\jakub.izewski\\Desktop\\Repositories\\MyGithubRepository\\algorithms\\src\\com\\learning\\GoogleCodeJam\\OversizedPancakeFlipper\\A-large-practice.in")));
        FileWriter bfw = new FileWriter(new File("C:\\Users\\jakub.izewski\\Desktop\\Repositories\\MyGithubRepository\\algorithms\\src\\com\\learning\\GoogleCodeJam\\OversizedPancakeFlipper\\A-large-practice.out"));
        String numberOfTestCases = bf.readLine();

        for (int i = 0; i < Integer.valueOf(numberOfTestCases); i++) {
            String[] line = bf.readLine().split(" ");
            int numberOfFlips = Integer.valueOf(line[1]);
            char[] pancakes = line[0].toCharArray();
            int numberOfTotalFlipsNeeded = 0;
            for (int j = 0; j < pancakes.length; j++) {
                if (pancakes[j] == '-') {
                    if (j + numberOfFlips > pancakes.length) {
                        numberOfTotalFlipsNeeded = -1;
                    } else {
                        for (int w = j; w < j + numberOfFlips; w++) {
                            if (pancakes[w] == '+') {
                                pancakes[w] = '-';
                            } else {
                                pancakes[w] = '+';
                            }
                        }
                        numberOfTotalFlipsNeeded += 1;
                    }
                }
            }
            if (numberOfTotalFlipsNeeded >= 0)
                bfw.write("Case #" + (i + 1) + ": " + numberOfTotalFlipsNeeded + "\n");
            else
                bfw.write("Case #" + (i + 1) + ": IMPOSSIBLE\n");
        }
        bfw.close();
    }

    public static void main(String... args) throws IOException {
        pancakes();
    }

}
