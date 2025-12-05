package com.estudo.arquivos.classesutilitarias05.revisao.temporaladjusters;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Teste {
    public static void main(String[] args) {
        LocalDate agora = LocalDate.now();
        LocalDate proximaSegunda = agora.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        LocalDate proximoAno = agora.with(TemporalAdjusters.firstDayOfNextYear());

        System.out.println("Agora: " + agora);
        System.out.println("Proxima segunda-feira: " + proximaSegunda);
        System.out.println("Proximo ano: " + proximoAno);
    }
}
