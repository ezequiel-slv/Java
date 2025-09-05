package com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ConcorrenteUm extends Pessoa implements AnotarNumeros{
    @Override
    public void addInformacoes() {
        super.addInformacoes();
    }

    @Override
    public Set<Integer> numeros() {
        Scanner entrada = new Scanner(System.in);
        Set<Integer> numeros = new HashSet<>();

        System.out.println("Digite 6 números de 1 a 60: ");

        while (numeros.size() < 6){
            System.out.print((numeros.size() + 1) + ": ");
            if (entrada.hasNextInt()){
                int num = entrada.nextInt();

                if (num >= 1 && num <= 60){
                    if (!numeros.contains(num)){
                        numeros.add(num);
                    }else{
                        System.out.println("Número repetido! Digite outro número.");
                    }
                }else{
                    System.out.println("Número inválido! Digite um número de 1 a 60");
                }
            }else{
                System.out.println("Valor inválido!");
                entrada.nextInt();
            }
        }

        return numeros;
    }
}
