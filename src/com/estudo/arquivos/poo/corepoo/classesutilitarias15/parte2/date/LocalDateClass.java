package com.estudo.arquivos.poo.corepoo.classesutilitarias15.parte2.date;

import java.time.LocalDate;
import java.time.Month;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateClass {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2020, Month.JUNE, 16);
        System.out.println("Data setada: " + localDate);

        LocalDate hoje = LocalDate.now();
        System.out.println("Data padrão do sistema: " + hoje);

        long between = ChronoUnit.YEARS.between(hoje, localDate);
        System.out.println(between);

        LocalDate aumentarAno = localDate.plusYears(5);
        System.out.println("Adicionado ano: " + aumentarAno);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatted = localDate.format(formatter);
        System.out.println("Data formatada: " + formatted);
    }
}
