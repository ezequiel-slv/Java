package com.estudo.arquivos.poo.revisao.polimorfismo13.service2;

import com.estudo.arquivos.poo.revisao.polimorfismo13.dominio2.Tv;

import java.util.Set;

public class Sortear {
    public static void sortearNumeros(Tv tv){
        Set<Integer> premiado = tv.numeroPremiado();
        System.out.println("------");
        System.out.println("Número premiado: " + premiado);
    }
}
