package com.revisao.arquivos.poo02.associacao06.arraysobjeto01.teste;

import com.revisao.arquivos.poo02.associacao06.arraysobjeto01.dominio.Animal;

public class AnimalTeste {
    public static void main(String[] args) {
        Animal animal01 = new Animal("Cachorro");
        Animal animal02 = new Animal("Gato");
        Animal animal03 = new Animal("Papagaio");

        Animal[] animals = {animal01, animal02, animal03};

        for (Animal animal : animals) {
            animal.imprime();
        }
    }
}
