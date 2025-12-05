package com.estudo.arquivos.classesutilitarias05.revisao.cronounit;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CronoUnitClass {
    public static void main(String[] args) {
        LocalDate dt1 = LocalDate.of(2025, 5, 1);
        LocalDate dt2 = LocalDate.of(2025, 5, 20);

        long b = ChronoUnit.DAYS.between(dt1, dt2);
        System.out.println(b);

        System.out.println("----");

        LocalDate agora = LocalDate.now();

        LocalDate depoisDez = agora.plus(10, ChronoUnit.DAYS);
        System.out.println(depoisDez);

        System.out.println("----");

        LocalDate depoisCincoAnos = agora.plus(5, ChronoUnit.YEARS);
        System.out.println(depoisCincoAnos);
    }
}
