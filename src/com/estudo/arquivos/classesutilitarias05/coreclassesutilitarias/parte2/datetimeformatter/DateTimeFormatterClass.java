package com.estudo.arquivos.classesutilitarias05.coreclassesutilitarias.parte2.datetimeformatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterClass {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String d1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("BASIC_ISO_DATE: " + d1);

        System.out.println("------");

        String d2 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("ISO_LOCAL_DATE: " + d2);

        System.out.println("------");

        String d3 = date.format(DateTimeFormatter.ISO_DATE);
        System.out.println("ISO_DATE: " + d3);

        System.out.println("parse");

        LocalDate parse1 = LocalDate.parse("20250928", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("parse 1: " + parse1);

        System.out.println("------");

        LocalDate parse2 = LocalDate.parse("2025-09-28", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("parse 2: " + parse2);

        System.out.println("------");

        LocalDate parse3 = LocalDate.parse("2025-09-28", DateTimeFormatter.ISO_DATE);
        System.out.println("parse 3: " + parse3);

        System.out.println("------");

        LocalDateTime ldt1 = LocalDateTime.now();
        String l4 = ldt1.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("ISO_DATE_TIME: " + l4);

        LocalDateTime parseldt1 = LocalDateTime.parse("2025-09-28T17:57:05.804425754", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("parse: " + parseldt1);

        System.out.println("------");

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println("format BR: " + formatBR);

        System.out.println("------");

        DateTimeFormatter formatterEUA = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formatEUA = LocalDate.now().format(formatterEUA);
        System.out.println("format EUA: " + formatEUA);

        System.out.println("------");

        DateTimeFormatter formatterJP = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String formatJP = LocalDate.now().format(formatterJP);
        System.out.println("format JP: " + formatJP);

        System.out.println("------");

        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(formatterGR);
        System.out.println("format GR: " + formatGR);
    }
}
