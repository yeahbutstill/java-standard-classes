package com.yeahbutstill.testgawe;

public class Loop1 {
    public static void main(String[] args) {
        int i, j;
        int n = 5;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if ((i == j) || (i + j == n - 1)) {
                    System.out.print(i + 1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
