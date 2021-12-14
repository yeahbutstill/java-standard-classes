package com.yeahbutstill;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama : ");
        String nama = scanner.nextLine();

        System.out.print("Umur : ");
        int umur = scanner.nextInt();

        System.out.print("Apakah sudah benar : (y atau n) ");
        while (scanner.hasNextLine()) {
            if (scanner.hasNextBoolean()) {
                if (scanner.nextBoolean()) {
                    System.out.println(scanner.nextLine());
                } else {
                    break;
                }
            } else {
                System.out.println(scanner.nextLine());
                break;
            }
        }
        scanner.close();

        System.out.println("Hello " + nama);
        System.out.println("Umur " + umur);
    }
}
