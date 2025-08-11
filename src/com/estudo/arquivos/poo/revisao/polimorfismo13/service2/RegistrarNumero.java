package com.estudo.arquivos.poo.revisao.polimorfismo13.service2;

import com.estudo.arquivos.poo.revisao.polimorfismo13.dominio2.Pessoa;

public class RegistrarNumero {
    public static void armazenarNumeros(Pessoa pessoa){
        String numeros = pessoa.numeros();
        System.out.println("Seus números são: " + numeros);
    }
}
