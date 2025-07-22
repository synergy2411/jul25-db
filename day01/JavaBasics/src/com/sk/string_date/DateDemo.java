package com.sk.string_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateDemo {
    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate today = LocalDate.now();
        System.out.println("Current Year " + today.getYear());
        System.out.println("Day of Month : " + today.getDayOfMonth());
        System.out.println("After 7 days from today : " + today.plusDays(7));

    }
}
