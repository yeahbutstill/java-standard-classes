package com.yeahbutstill;

import java.math.BigInteger;

public class BigIntegerApp {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("10000000000000000000000000000");
        BigInteger b = new BigInteger("10000000000000000000000000000");
        BigInteger result = a.add(b);

        System.out.println(result);
    }
}
