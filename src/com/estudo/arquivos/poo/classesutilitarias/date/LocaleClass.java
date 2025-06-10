package com.estudo.arquivos.poo.classesutilitarias.date;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleClass {
    public static void main(String[] args) {
        Locale localeEUA = new Locale("en", "US");
        Locale localeBrazil = new Locale("pt", "BR");
        Locale localeEspanha = new Locale("es", "ES");

        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeBrazil);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeEspanha);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeEUA);
        System.out.println("Brasil: " + df1.format(calendar.getTime()));
        System.out.println("España: " + df2.format(calendar.getTime()));
        System.out.println("United States: " + df3.format(calendar.getTime()));
    }
}
