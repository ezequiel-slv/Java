package com.estudo.arquivos.classesutilitarias05.coreclassesutilitarias.parte2.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClass {
    public static void main(String[] args) {
        String regex = "aba";
        String texto = "abababababa";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto:   " + texto);

        System.out.println("índice:  0123456789");
        System.out.println("regex: "+regex);

        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start() + " ");
        }
    }
}
