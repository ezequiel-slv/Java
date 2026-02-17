package com.estudo.arquivos.introducao01.tiposprimitivos01;

public class TiposPrimitivos01 {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean

        int idade = 22; //valor inteiro
        long NumeroGrande = 343434342; //valor inteiro longo
        float altura = 1.69f; // Armazena números com casas decimais, mas com menos precisão que double
        double peso = 69.5; // Armazena números com casas decimais (mais preciso que float).
        char letra = 'E'; //Armazena um único caractere
        byte NumeroPequeno = 10; //inteiro de 8 bits
        short PopulacaoCidade = 30000; //inteiro de 16 bits
        boolean isAdult = true; //Armazena valores lógicos (true ou false).

        System.out.println("A idade é " + idade);
        System.out.println(NumeroGrande);
        System.out.println("A altura é " + altura);
        System.out.println("O peso é " + peso);
        System.out.println("A Inicial é " + letra);
        System.out.println(NumeroPequeno);
        System.out.println("O número de habiantes da cidade é " + PopulacaoCidade);
        System.out.println(isAdult);
    }
}
