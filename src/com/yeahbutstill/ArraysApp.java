package com.yeahbutstill;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {

        int[] numbers = {
                2,24,432,43252,121,2,1,22,3,3,3,-21,+22
        };

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 432));
        System.out.println(Arrays.binarySearch(numbers, 7));
        System.out.println(Arrays.binarySearch(numbers, 3));

        int[] ints1 = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(ints1));

        int[] ints2 = Arrays.copyOfRange(numbers, 5, 10);
        System.out.println(Arrays.toString(ints2));

    }
}
