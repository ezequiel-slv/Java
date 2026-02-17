package com.estudo.arquivos.classesutilitarias04.parte2.temporaladjusters;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersClass {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        now = now.withDayOfMonth(23);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("--------");

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
