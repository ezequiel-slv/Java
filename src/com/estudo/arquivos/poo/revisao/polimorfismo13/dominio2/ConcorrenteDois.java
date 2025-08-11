package com.estudo.arquivos.poo.revisao.polimorfismo13.dominio2;

import java.util.Scanner;

public class ConcorrenteDois extends Pessoa implements AnotarNumeros {

    @Override
    public void imprimir() {
        System.out.println("--------");
        super.imprimir();
    }

    @Override
    public void addInformacoes() {
        super.addInformacoes();
    }

    @Override
    public String numeros() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 6 números de 1 a 60: ");
        String c2 = entrada.nextLine();
        entrada.close();
        return "Seus números são: " + c2;
    }
}
