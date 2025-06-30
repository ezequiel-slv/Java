package com.estudo.arquivos.poo.src.classesutilitarias15.parte2.formatacao;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatClass {
    public static void main(String[] args) {
        Locale localeRBR = Locale.of("pt", "BR");
        Locale localeUS = Locale.US;
        Locale localeJP = Locale.JAPAN;
        NumberFormat[] nft = new NumberFormat[3];
        nft[0] = NumberFormat.getInstance(localeRBR);
        nft[1] = NumberFormat.getInstance(localeJP);
        nft[2] = NumberFormat.getInstance(localeUS);
        double valor =  10_000.123;
        for (NumberFormat numberFormat : nft){
            System.out.println(numberFormat.format(valor));
        }
    }
}
