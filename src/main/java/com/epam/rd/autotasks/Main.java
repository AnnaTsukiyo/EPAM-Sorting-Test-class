package com.epam.rd.autotasks;

public class Main {
    public static void main(String[] args) {
        Sorting srt = new Sorting();
        int[] array = new int[]{1,-10, Integer.MAX_VALUE, Integer.MIN_VALUE};
        srt.sort(array);
        for (int i: array) {
            System.out.println(i);
        }
    }
}
