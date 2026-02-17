package com.estudo.arquivos.classesutilitarias04.parte2.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClass3 {
    public static void main(String[] args) {
        // \d = todos numero
        // \D = tudo que não for digito
        // \s = Espaços em branco
        // \S = todos os caracteres exeto os brancos
        // lw = a-zA-Z, digitos, _
        // lW = oposto de lw
        // [] = usando para adicionar validações
        String regex = "[a-zA-Z]";
        String texto = "ezequiel_silva_lima01@gmail.com ";

        String regex2 = "0[xX][0-9a-fA-F]+";
        String texto2 = "0x1A3F";

        Pattern pattern = Pattern.compile(regex2);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("Texto:   " + texto2);

        System.out.println("índice:  0123456789");
        System.out.println("regex: "+regex2);

        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
