package com.yeahbutstill.testgawe;

public class TestDua {
    public static void main(String args[]) {
        try {
            int x = 0;
            for (x = 1; x < 4; x++) ;
            System.out.println(x);
        } catch (Exception e) {
        } finally {
            System.out.println("Error");
        }
    }
}
