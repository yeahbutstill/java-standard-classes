package com.yeahbutstill;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {
        Date date = new Date();
        long milisecond = date.getTime();

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, -27);

        System.out.println(date);
        System.out.println(milisecond);

        Date result = calendar.getTime();
        System.out.println(result);
    }
}
