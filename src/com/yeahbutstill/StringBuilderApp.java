package com.yeahbutstill;

public class StringBuilderApp {
    public static void main(String[] args) {
        // Not recomended
        String name = "Dani"; // tidak satu object
        name = name + " " + "Setiawan"; // tidak satu object
        name = name + " " + "Software Engineer"; // tidak satu object

        System.out.println(name); // tidak satu object

        // None thread safe string builder
        StringBuilder stringBuilder = new StringBuilder(); // Menjadi 1 object di memory
        stringBuilder.append("Dani");
        stringBuilder.append(" ");
        stringBuilder.append("Setiawan");
        stringBuilder.append(" ");
        stringBuilder.append("Setiawan");

        String name1 = stringBuilder.toString();
        System.out.println(name1);
    }
}
