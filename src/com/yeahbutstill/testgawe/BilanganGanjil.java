package com.yeahbutstill.testgawe;

import java.util.Scanner;

public class BilanganGanjil {
    public static void main(String[] args) {
        Scanner bilangan = new Scanner(System.in);
        int ganjil, input, jumlah = 0;

        System.out.print("Input : ");
        input = bilangan.nextInt();
        System.out.print("Deret Bilangan Ganjilnya = ");
        for (ganjil = 1; ganjil <= input; ganjil++) {
            if (ganjil % 2 == 1) {
                jumlah = jumlah + ganjil;
                System.out.print(ganjil + " ");

            }
        }
        System.out.println();
        System.out.println("Jumlah Deret Bilangan Ganjil Adalah = " + jumlah + " ");
    }
}

