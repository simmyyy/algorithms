package com.learning.GoogleCodeJam.TidyNumbers;


import java.io.*;

public class Solutions {

    public static void tidyNumbers() throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(new File("C:\\Users\\jakub.izewski\\Desktop\\Repositories\\MyGithubRepository\\algorithms\\src\\com\\learning\\GoogleCodeJam\\TidyNumbers\\B-large-practice.in")));
        FileWriter bfw = new FileWriter(new File("C:\\Users\\jakub.izewski\\Desktop\\Repositories\\MyGithubRepository\\algorithms\\src\\com\\learning\\GoogleCodeJam\\TidyNumbers\\B-large-practice.out"));
        String numberOfTestCases = bf.readLine();

        for (int i = 0; i < Integer.valueOf(numberOfTestCases); i++) {
            String lastCountedNumberByTatiana = bf.readLine();
            Long w = Long.valueOf(lastCountedNumberByTatiana);
            char[] digits = String.valueOf(w).toCharArray();
            int digitPosition;
            while (true) {
                boolean isCorrect = true;
                char previousDigit = digits[0];
                for (int j = 1; j < digits.length; j++) {
                    if (digits[j] >= previousDigit) {
                        previousDigit = digits[j];
                    } else {
                        digitPosition = j;
                        digits[digitPosition-1] -= 1;
                        for (int ss = digitPosition; ss < digits.length; ss++) {
                            digits[ss] = '9';
                        }
                        isCorrect = false;
                        break;
                    }
                }
                if (isCorrect) {
                    String result = "";
                    for (int res = 0; res < digits.length; res++) {
                        result += digits[res];
                    }
                    bfw.write("Case #" + (i + 1) + ": " + result.replaceAll("^0*", "") + "\n");
                    break;
                }
            }
        }
        bfw.close();
    }

    public static void main(String... args) throws IOException {
        tidyNumbers();
    }

}

