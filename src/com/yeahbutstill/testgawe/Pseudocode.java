package com.yeahbutstill.testgawe;

import java.util.Scanner;

public class Pseudocode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("nilai 1-5 input : ");
        int nilai = in.nextInt();

        if (nilai < 1) {
            System.out.println("Senin");
        } else if (nilai == 3) {
            System.out.println("Minggu");
        } else if (nilai > 4) {
            System.out.println("Sabtu");
        } else {
            System.out.println("maaf batas 5");
        }
    }
}
