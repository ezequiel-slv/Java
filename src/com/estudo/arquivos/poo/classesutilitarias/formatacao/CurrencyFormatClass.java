package com.estudo.arquivos.poo.classesutilitarias.formatacao;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CurrencyFormatClass {
    public static void main(String[] args) {
        Locale localeUS = Locale.US;
        Locale localeBR = Locale.of("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeUA = Locale.of("uk", "UA");

        NumberFormat[] nmft = new NumberFormat[4];
        nmft[0] = NumberFormat.getCurrencyInstance(localeUS);
        nmft[1] = NumberFormat.getCurrencyInstance(localeBR);
        nmft[2] = NumberFormat.getCurrencyInstance(localeJP);
        nmft[3] = NumberFormat.getCurrencyInstance(localeUA);

        double currency = 100_000_000.123;

        for (NumberFormat numberFormat : nmft){
            System.out.println(numberFormat.format(currency));
        }
    }
}
