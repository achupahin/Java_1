package edu.achupahin.homeworks.Java_1_5;

import sun.util.resources.cldr.af.CalendarData_af_ZA;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Main {
    static final Random RANDOM = new Random ();
    static final Calendar CALENDAR = Calendar.getInstance ();


    public static void main(String[] args) {
        Life[] life= {
                new Woman("Eva", getHumanBirth().equals(0), getHumanBirth[1], 50f, 175f, "Adams", true),
                new Woman("Maria", getHumanBirth(), getHumanBirth, 50f, 175f, "Magdalena", false),

        };
    }

    public static int getRandomInt(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        return RANDOM.nextInt((max - min) + 1) + min;
    }

    public static Date[] getHumanBirth () {
        Date ret[]=new Date[2];
        CALENDAR.clear();
        CALENDAR.set(1980,getRandomInt(1,12),getRandomInt(1,30));
        ret[0]=CALENDAR.getTime();
        CALENDAR.add(Calendar.YEAR, getRandomInt(50,90));
        CALENDAR.add(Calendar.MONTH, getRandomInt(1,12));
        CALENDAR.add(Calendar.DATE, getRandomInt(1,30));
        ret[1]=CALENDAR.getTime();
        return ret;
    }



}
