package com.estudo.arquivos.poo03.revisao.classesutilitarias15.parte2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeClass {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        System.out.println("-----");

        LocalDate date = LocalDate.of(2025, 10, 29);
        LocalTime time = LocalTime.of(18, 0, 0);

        System.out.println(date);
        System.out.println(time);

        System.out.println("-----");

        LocalDateTime ldt1 = date.atTime(time);
        LocalDateTime ldt2 = time.atDate(date);

        System.out.println(ldt1);
        System.out.println(ldt2);
    }
}
