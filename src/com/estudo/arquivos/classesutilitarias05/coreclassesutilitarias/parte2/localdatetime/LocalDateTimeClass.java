package com.estudo.arquivos.classesutilitarias05.coreclassesutilitarias.parte2.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeClass {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        LocalDateTime dateTime = date.atTime(time);
        System.out.println(dateTime);

        DateTimeFormatter frmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formate = dateTime.format(frmt);
        System.out.println(formate);
    }
}
