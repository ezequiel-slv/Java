package com.estudo.arquivos.poo.corepoo.classesutilitarias15.parte2.time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeClass {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(12, 30, 2);
        System.out.println("Hora setada: " + time);

        LocalTime timeNow = LocalTime.now();
        System.out.println("Hora do sistema: " + timeNow);

        long between = ChronoUnit.HOURS.between(time, timeNow);
        System.out.println(between);

        System.out.println(timeNow.getHour());
        System.out.println(timeNow.getMinute());
        System.out.println(timeNow.getSecond());
    }
}
