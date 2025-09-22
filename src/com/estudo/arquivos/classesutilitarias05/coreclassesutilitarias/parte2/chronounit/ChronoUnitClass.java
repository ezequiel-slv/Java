package com.estudo.arquivos.classesutilitarias05.coreclassesutilitarias.parte2.chronounit;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitClass {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(2002, Month.JUNE, 10, 7, 0, 0);
        LocalDateTime now = LocalDateTime.now();

        long between = ChronoUnit.YEARS.between(aniversario, now);
        long between2 = ChronoUnit.MONTHS.between(aniversario, now);
        long between3 = ChronoUnit.WEEKS.between(aniversario, now);

        System.out.println("Idade em anos: " + between);
        System.out.println("Idade em meses: " + between2);
        System.out.println("Idade em semanas: " + between3);
    }
}
