package com.estudo.arquivos.introducao01.operadores02;

public class Operadores {
    public static void main(String[] args) {
        // - + / *

        int Numero01 = 10;
        double Numero02 = 20;
        var Resultado = (Numero01 + Numero02);
        System.out.println(Resultado);

        //%
        int resto = 20 % 3;
        System.out.println(resto);

        // booleans: < > <= == !=

        boolean DezmaiorVinte = 10 > 20;
        System.out.println("Dez é maior que vinte? "+ DezmaiorVinte);


        // AND (&&)
        int idade = 29;
        float salario = 3500;

        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 3500;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3500;
        System.out.println("isDentroDaLeiMaiorQueTrinta: " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: " + isDentroDaLeiMenorQueTrinta);

        // || (OR)
        double contaCorrente = 200;
        double contaPoupanca = 10000;
        float valorPlaystation = 4000;

        boolean isPlaystationCompraProvavel = contaCorrente > valorPlaystation || contaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCompraProvavel: " + isPlaystationCompraProvavel);

        // atribuição

        // = += -= *= /= %=

        salario = 1200;
        salario = salario + 200; //forma básica

        int ajuste = 1200;
        ajuste += 200; //com atribuição aritimetica
        System.out.println(ajuste);

        //outra forma de atribuir: ++ e --
        int idadeAluno = 20;
        idadeAluno +=1;
        idadeAluno --;
        System.out.println(idadeAluno);


    }
}
