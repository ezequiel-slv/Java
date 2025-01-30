package com.estudo.arquivos.revisao;

public class RevisaoTiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        String nome = "Ezequiel";
        int idade = 22;
        float altura = 1.69f;
        double peso = 67;
        boolean isAdult = true;

        //faça os seguintes exercícios:
        //imprima as informaçóes da pessoa com concatenação
        System.out.println(nome + " tem " + idade + " anos, " + altura + "m de altura e pesa " + peso + "kg ");

        // Calculando o IMC (Índice de Massa Corporal)
        double imc = peso / (altura * altura);
        System.out.println("o imc é de: " + String.format("%.2f", imc));

        //Verificando se a pessoa é adulta
        boolean condicao = idade >= 22;

        if (condicao){
            System.out.println("É adulto");
        }if (! condicao){
            System.out.println("Não é adulto");
        }
    }
}
