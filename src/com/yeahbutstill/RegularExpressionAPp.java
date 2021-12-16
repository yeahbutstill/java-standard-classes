package com.yeahbutstill;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionAPp {
    public static void main(String[] args) {
        String name = "Dani Setiawan adalah Software Engineer di Perusahaan ternamam, dan dia mempunya istri yang bernama Maya Triyanti";

        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*[a]");
        Matcher matcher = pattern.matcher(name);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
