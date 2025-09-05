package com.estudo.arquivos.poo03.revisao.classesabstratas11.teste;

import com.estudo.arquivos.poo03.revisao.classesabstratas11.dominio2.Animal;
import com.estudo.arquivos.poo03.revisao.classesabstratas11.dominio2.Cachorro;
import com.estudo.arquivos.poo03.revisao.classesabstratas11.dominio2.Gato;

public class AnimalTeste {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.setNome("Gato");
        //gato.emitirSom();

        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Cachorro");
        //cachorro.emitirSom();

        Animal[] animais = {gato, cachorro};
        for (Animal animal : animais) {
            animal.emitirSom();
        }


    }
}
