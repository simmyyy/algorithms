package com.learning.DynamicProgramming;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DoubleQueue {

    //https://www.hackerrank.com/challenges/java-dequeue/problem
    //solved using dynamic programming - memoization
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;
        int size = 0;
        int[] help = new int[10000000];
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if (m == 1) {
                size = 1;
                break;
            }
            if (i >= m) {
                int pos = (Integer) deque.pollLast();
                help[pos]--;
                if (help[pos] == 0) max--;
            }
            deque.addFirst(num);
            help[num]++;
            if (help[num] == 1) {
                max++;
                if (max > size) size = max;
            }
        }
        System.out.println(size);
    }

}
