package com.yeahbutstill.testgawe;

import java.util.Scanner;

public class GajiKarMingguan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Gol : ");
        int gol = in.nextInt();
        System.out.print("Lembur : ");
        int lembur = in.nextInt();

        switch (gol) {
            case 1:
                System.out.println();
                break;
            case 2:
                System.out.println("selasa");
                break;
            case 3:
                System.out.println("rabu");
                break;
            case 4:
                System.out.println("kamis");
                break;
            case 5:
                System.out.println("jumat");
                break;
            case 6:
                System.out.println("sabtu");
                break;
            case 7:
                System.out.println("minggu");
                break;
            default:
                System.out.println("maaf jumlah hari hanya ada 7");
        }
    }
}
