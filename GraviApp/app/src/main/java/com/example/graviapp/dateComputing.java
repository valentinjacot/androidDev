package com.example.graviapp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class dateComputing {
    public static long getDifferenceDays(Calendar d1,Calendar d2) {
        long diff = d2.getTime().getTime() - d1.getTime().getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
    public static int getDays(int res){
        return res % 7;
    }
    public static int getWeeks(int res){
        return (int) Math.ceil(res/7);
    }
}
