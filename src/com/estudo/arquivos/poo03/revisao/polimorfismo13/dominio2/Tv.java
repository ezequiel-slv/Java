package com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Tv implements NumeroPremiado{
    @Override
    public Set<Integer> numeroPremiado() {
        Random random = new Random();
        Set<Integer> numeros = new HashSet<>();

        while (numeros.size() < 6){
            int numero = random.nextInt(60) + 1;
            numeros.add(numero);
        }

        return numeros;
    }
}
