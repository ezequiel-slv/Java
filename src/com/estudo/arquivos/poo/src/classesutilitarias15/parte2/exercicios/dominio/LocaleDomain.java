package com.estudo.arquivos.poo.src.classesutilitarias15.parte2.exercicios.dominio;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleDomain {
    private String countryFull;
    private String language;
    private String country;

    public void Imprimir(){
        Locale locale01 = Locale.of(language, country);
        Calendar calendar = Calendar.getInstance();
        DateFormat fd1 = DateFormat.getDateInstance(DateFormat.FULL, locale01);
        System.out.println(countryFull + ": " + fd1.format(calendar.getTime()));
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCountryFull(String countryFull) {
        this.countryFull = countryFull;
    }
}
