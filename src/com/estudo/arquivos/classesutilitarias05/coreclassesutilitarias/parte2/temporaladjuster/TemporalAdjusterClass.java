package com.estudo.arquivos.classesutilitarias05.coreclassesutilitarias.parte2.temporaladjuster;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class DiaUtil implements TemporalAdjuster{
    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek diaDaSemana = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));

        int addDia;
        switch (diaDaSemana){
            case FRIDAY:
                addDia = 3;
            break;

            case  SATURDAY:
                addDia = 2;
            break;

            default:
                addDia = 1;
            break;
        }
        return temporal.plus(addDia, ChronoUnit.DAYS);
    }
}

public class TemporalAdjusterClass {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());


        System.out.println("----");


        now = LocalDate.now().with(new DiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
