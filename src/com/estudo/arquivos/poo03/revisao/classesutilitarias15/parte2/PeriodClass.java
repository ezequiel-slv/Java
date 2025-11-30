package com.estudo.arquivos.poo03.revisao.classesutilitarias15.parte2;

import java.time.LocalDate;
import java.time.Period;

public class PeriodClass {
    public static void main(String[] args) {
        Period period = Period.of(4, 5, 3);
        System.out.println(period);

        System.out.println("----");

        LocalDate dtInicial = LocalDate.of(2002, 6, 10);
        LocalDate dtFinal = LocalDate.now();

        Period p = Period.between(dtInicial, dtFinal);
        System.out.println(p);
    }
}
