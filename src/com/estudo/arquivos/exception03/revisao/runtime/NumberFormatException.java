package com.estudo.arquivos.exception03.revisao.runtime;

public class NumberFormatException {
    public static void main(String[] args) {

        /*
        A NumberFormatException é uma exceção do tipo RuntimeException que ocorre quando você tenta converter uma
         String para um tipo numérico (int, double, etc.), mas essa String não tem um formato válido para isso.
         */

        // metodo parse feito de forma esperada
        String num = "10";
        int numero1 = Integer.parseInt(num);
        System.out.println(numero1);

        // com erro numberformat
        System.out.println("-----");
        String texto1 = "abc";
        int numero2 = Integer.parseInt(texto1); // erro numberformat (esperava-se um numero no texto1
        System.out.println(numero2);

        // com erro numberformat
        System.out.println("-----");
        String texto2 = "5.2";
        int numero3 = Integer.parseInt(texto2); // erro numberformat (esperava-se um numero inteiro no texto2
        System.out.println(numero3);


        // com erro numberformat
        System.out.println("-----");
        String texto3 = "abcd";
        double numero4 = Double.parseDouble(texto3); // erro numberformat (esperava-se um numero no texto3
        System.out.println(numero4);


    }
}
