package com.yeahbutstill;

public class NumberApp {
    public static void main(String[] args) {
        Integer integerValue = 10;

        Long aLong = integerValue.longValue();
        Double aDouble = aLong.doubleValue();
        Short aShort = aDouble.shortValue();

        String contoh = "10000";
        String contoh1 = "100.10";

        Integer objectInt = Integer.valueOf(contoh); // integer object
        int primitfInt = Integer.parseInt(contoh); // integer primitif
        Double aDouble1 = Double.valueOf(contoh1);

        System.out.println(objectInt);
        System.out.println(primitfInt);
        System.out.println(aDouble1);

    }
}
