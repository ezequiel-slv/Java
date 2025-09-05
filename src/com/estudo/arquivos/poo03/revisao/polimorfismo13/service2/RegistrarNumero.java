package com.estudo.arquivos.poo03.revisao.polimorfismo13.service2;

import com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio2.Pessoa;

import java.util.Set;

public class RegistrarNumero {
    public static void armazenarNumeros(Pessoa pessoa){
        Set<Integer> numeros = pessoa.numeros();
        System.out.println("------");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("CPF: " + pessoa.getCpf());
        System.out.println("Seus números são: " + numeros);
    }
}
