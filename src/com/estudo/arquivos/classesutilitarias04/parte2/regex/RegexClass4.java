package com.estudo.arquivos.classesutilitarias04.parte2.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClass4 {
    public static void main(String[] args) {
        // \d = todos numero
        // \D = tudo que não for digito
        // \s = Espaços em branco
        // \S = todos os caracteres exeto os brancos
        // lw = a-zA-Z, digitos, _
        // lW = oposto de lw
        // [] = usando para adicionar validações
        // ? Zero ou uma
        // * Zero ou mais
        // + Uma ou mais
        // {n, m} n até m
        // ()
        // |
        // $
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0x1A3F 0x10G 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto:   " + texto);

        System.out.println("índice:  0123456789");
        System.out.println("regex: "+regex);

        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
