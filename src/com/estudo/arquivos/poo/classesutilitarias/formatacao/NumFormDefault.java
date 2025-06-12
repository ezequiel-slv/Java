package com.estudo.arquivos.poo.classesutilitarias.formatacao;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class NumFormDefault {
    public static void main(String[] args) {
        Locale local = Locale.getDefault();
        Calendar calendar = Calendar.getInstance();

        DateFormat dft = DateFormat.getDateInstance(DateFormat.FULL, local);
        System.out.println(dft.format(calendar.getTime()));
    }
}
