package com.estudo.arquivos.classesutilitarias05.coreclassesutilitarias.parte2.formatacao;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleClass {
    public static void main(String[] args) {
        Locale localeEUA = Locale.of("en", "US");
        Locale localeBrazil = Locale.of("pt", "BR");
        Locale localeEspanha = Locale.of("es", "ES");
        Locale localeJapao = Locale.of("ja", "JP");



        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeBrazil);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeEspanha);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeEUA);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);

        System.out.println("Brasil: " + df1.format(calendar.getTime()));
        System.out.println("España: " + df2.format(calendar.getTime()));
        System.out.println("United States: " + df3.format(calendar.getTime()));
        System.out.println("日本: " + df4.format(calendar.getTime()));
    }
}
