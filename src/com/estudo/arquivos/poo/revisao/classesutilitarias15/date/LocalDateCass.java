package com.estudo.arquivos.poo.revisao.classesutilitarias15.date;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateCass {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, Month.SEPTEMBER, 2);
        System.out.println(date);

        LocalDate dateNow = LocalDate.now();
        System.out.println(dateNow);

        LocalDate dataParse = LocalDate.parse("2002-06-10");
        System.out.println(dataParse);
    }
}
