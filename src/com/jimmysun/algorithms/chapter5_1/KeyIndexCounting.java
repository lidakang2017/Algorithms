package com.jimmysun.algorithms.chapter5_1;

public class KeyIndexCounting {

    public static void sort(String[] a) {
        int N = a.length;
        int R = 64;
        String[] aux = new String[N];
        int[] count = new int[R + 1];
        //counting appearance frequency
        for (int i = 0; i < N; i++) {
            int tempNum = a[i].charAt(0);
            count[tempNum + 1]++;
        }
        //turn frequency into index
        for (int r = 0; r < R; r++) {
            count[r + 1] += count[r];
        }
        //classify
        for (int i = 0; i < N; i++) {
            int tempNum = a[i].charAt(0);
            int countTemp1 = count[tempNum];
            count[tempNum]++;
            aux[countTemp1] = a[i];
        }
        //write back
        for (int i = 0; i < N; i++) {
            a[i] = aux[i];
        }
    }

    public static void main(String[] args) {
        String[] a = {"4", "2", "3", "1", "3", "2", "7"};
        sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
