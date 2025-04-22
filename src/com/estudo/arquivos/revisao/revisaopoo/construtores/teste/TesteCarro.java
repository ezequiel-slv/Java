package com.estudo.arquivos.revisao.revisaopoo.construtores.teste;

import com.estudo.arquivos.revisao.revisaopoo.construtores.dominio.Carro;
import com.estudo.arquivos.revisao.revisaopoo.construtores.dominio.Carro02;
import com.estudo.arquivos.revisao.revisaopoo.construtores.dominio.ImprimeCarro;

import java.util.Scanner;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro("Mustang GT", "Ford", 2021);
        Carro02 carro02 = new Carro02("Corola Altis", "Toyota", 2023);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 1 ou 2 para escolher um carro: ");
        int escolha = entrada.nextInt();

        ImprimeCarro imprime = new ImprimeCarro(carro, carro02, escolha);

        imprime.imprimirEscolha();
        entrada.close();
    }
}
