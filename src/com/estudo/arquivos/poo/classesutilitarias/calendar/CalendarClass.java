package com.estudo.arquivos.poo.classesutilitarias.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarClass {
    public static void main(String[] args) {
        Calendar01();
        Calendar02();
    }

    public static void Calendar01(){
        Calendar calendar = Calendar.getInstance(); // Calendar é classe abstrata
        Date date = calendar.getTime(); // Imprime data e hora
        System.out.println(date);
    }

    public static void Calendar02(){
        Calendar calendar = Calendar.getInstance(); // Calendar é classe abstrata
        calendar.add(Calendar.HOUR, 1); // adicionando hora
        calendar.add(Calendar.YEAR, 1); // adicionando ano
        Date date = calendar.getTime(); // Imprime data e hora
        System.out.println(date);
    }

}
