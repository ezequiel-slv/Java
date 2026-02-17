package com.estudo.arquivos.classesutilitarias04.parte2.date;

import java.util.Date;

public class DateClass {
    public static void main(String[] args) {
        DateTest01();
        DateTest02();
    }

    public static void DateTest01(){
        System.out.println("----");
        Date date = new Date(); //long ms
        System.out.println(date); // imprime a data e hora
    }

    public static void DateTest02(){
        System.out.println("----");

        Date date = new Date(1_000_000_000);
        date.setTime(date.getTime() + 3_600_000); // adiciona 1h
        System.out.println(date);
    }
}
