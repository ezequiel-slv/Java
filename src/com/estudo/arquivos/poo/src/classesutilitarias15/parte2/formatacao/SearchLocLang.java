package com.estudo.arquivos.poo.src.classesutilitarias15.parte2.formatacao;

import java.util.Locale;

public class SearchLocLang {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale);

        String[] searchCountrys = Locale.getISOCountries();
        String[] searchLanguages = Locale.getISOLanguages();

        for (String searchCountry : searchCountrys){
            System.out.print(searchCountry + " ");
        }

        System.out.println();

        for (String searchLanguage : searchLanguages){
            System.out.print(searchLanguage + " ");
        }
    }
}
