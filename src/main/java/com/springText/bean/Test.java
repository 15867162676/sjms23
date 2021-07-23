package com.springText.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String a1 = "2020-10-20 00:00:01";
        String a2 = "2020-10-22 12:00:01";
        Date date1 = sdf.parse(a1);
        Date date2 = sdf.parse(a2);
        System.out.println(date1.getTime());
        System.out.println(date2.getTime());

        int dayNumber = (int) ((date2.getTime() - date1.getTime()) / (24 * 60 * 60 * 1000)) + 1;
        System.out.println(dayNumber);

        System.out.println(((date2.getTime() - date1.getTime()) / (24 * 60 * 60 * 1000)));

    }
}
