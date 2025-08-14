package com.estudo.arquivos.poo.corepoo.exception14.runtimeexception;

import com.estudo.arquivos.poo.corepoo.exception14.dominio.IllegalArgument;

import java.util.Scanner;

/*
verifica em tempo de execução que o método foi
chamado em um momento ou estsado inadequado do objeto
 */
public class IllegalStateException {
    public static void main(String[] args) {
       conexao();
       entradaFechada();
    }

    //exemplo 1
    public static void conexao(){
        IllegalArgument teste = new IllegalArgument();
        //teste.conectada();PW
        teste.enviarDados("Olá Mundo!");
    }

    public static void entradaFechada(){
        Scanner entrada = new Scanner(System.in);
        entrada.close(); // IllegalStateexception input foi fechada antes de receber valor

        System.out.println(entrada.nextLine());
    }
}
