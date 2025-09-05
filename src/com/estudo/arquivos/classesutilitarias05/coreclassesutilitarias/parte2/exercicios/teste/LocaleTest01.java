package com.estudo.arquivos.classesutilitarias05.coreclassesutilitarias.parte2.exercicios.teste;

import com.estudo.arquivos.classesutilitarias05.coreclassesutilitarias.parte2.exercicios.dominio.LocaleDomain;

import java.util.Scanner;

public class LocaleTest01 {
    public static void main(String[] args) {
        LocaleDomain locale = new LocaleDomain();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do seu país por extenso: ");
        String countryFullInput = entrada.nextLine();
        locale.setCountryFull(countryFullInput);

        System.out.println("Digite o idioma do seu país (com base na ISO 639): ");
        String languageInput = entrada.nextLine();
        locale.setLanguage(languageInput);

        System.out.println("Digite o nome do seu país (com base na ISO 3166): ");
        String countryInput = entrada.nextLine();
        locale.setCountry(countryInput);

        locale.Imprimir();
    }
}
