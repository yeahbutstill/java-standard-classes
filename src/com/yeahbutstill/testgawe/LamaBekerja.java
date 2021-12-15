package com.yeahbutstill.testgawe;

import java.util.Scanner;

public class LamaBekerja {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Jam Masuk : ");
        int jMasuk = in.nextInt();
        System.out.print("Jam Masuk : ");
        int jKeluar = in.nextInt();


        switch (jMasuk) {
            case 10:
                if (jKeluar == 11) {
                    System.out.println("Lama bekerja 1 jam ");
                } else if (jKeluar == 2) {
                    System.out.println("Lama bekerja 3 jam ");
                } else if (jKeluar == 7) {
                    System.out.println("Lama bekerja 8 jam ");
                }
                break;
            default:
                System.out.println("(-_-)");
        }
    }
}
