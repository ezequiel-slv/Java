package com.estudo.arquivos.classesutilitarias04.parte2.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClass5 {
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
        // . 1.3 = 123, 1@3
        String regex = "([a-zA-Z0-9._+-]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,})";
        String texto = "luffy@hotmail.com, 123@jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com, sakura@mail ";

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
