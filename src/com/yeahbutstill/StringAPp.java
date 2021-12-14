package com.yeahbutstill;

public class StringAPp {
  public static void main(String[] args) {
    // String itu kalau di Java tidak bisa berubah, sekali bikin membuat string datanya tidak bisa berubah
    String name = "Dani Setiawan";
    String nameToLower = name.toLowerCase();
    String nameToUpper = name.toUpperCase();

    System.out.println(name);
    System.out.println(nameToLower);
    System.out.println(nameToUpper);
    System.out.println(name.length()); // Ingat space pub dihitung character
    System.out.println(name.startsWith("Dani"));
    System.out.println(name.endsWith("Setiawan"));

    String[] splitName = name.split(" "); // memotong string dan character
    System.out.println(splitName);
    for (var value : splitName) {
      System.out.println(value);
    }

    System.out.println(" ".isBlank());
    System.out.println("       ".isBlank());
    System.out.println(" ".isEmpty());
    System.out.println("".isEmpty());

    System.out.println(name.charAt(0));

    char[] chars = name.toCharArray();
    System.out.println(chars[1]);
  }
}
