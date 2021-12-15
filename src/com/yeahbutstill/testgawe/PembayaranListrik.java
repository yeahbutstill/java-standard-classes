package com.yeahbutstill.testgawe;

import java.util.Scanner;

public class PembayaranListrik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Golongan : ");
        int gol = in.nextInt();
        System.out.print("Pemakaian : ");
        int pem = in.nextInt();


        switch (gol) {
            case 1:
                if (pem == 50) {
                    System.out.println("Pembayaran " + 100000);
                } else if (pem == 1000) {
                    System.out.println("Pembayaran " + 1100000);
                }
                break;
            case 2:
                if (pem == 150)
                    System.out.println("Pembayaran " + 300000);
                break;
            default:
                System.out.println("(-_-)");
        }
    }
}