package com.yeahbutstill;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        String[] names = {"Dani", "Setiawan", "Software", "Engineer"};
        StringJoiner stringJoiner = new StringJoiner(
                "||", "[", "]"
        );

        for (var name : names) {
            stringJoiner.add(name);
        }

        System.out.println(stringJoiner.toString());

        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        joiner.add("Mangga");
        joiner.add("Jeruk");
        joiner.add("Alpuket");

        String value = joiner.toString();
        System.out.println(value);
    }
}
