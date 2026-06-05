package com.revisao.arquivos.poo02.associacao06.umparamuitos02.teste;

import com.revisao.arquivos.poo02.associacao06.umparamuitos02.dominio.Animal;
import com.revisao.arquivos.poo02.associacao06.umparamuitos02.dominio.Zoologico;

public class ZoologicoTeste {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Onça");
        Animal anima2 = new Animal("Gorila");
        Animal anima3 = new Animal("Elefante");

        Zoologico zoologico = new Zoologico();
        zoologico.setNome("ZooTerra");

        Animal[] animals = {animal1, anima2, anima3};

        for (Animal animal : animals) {
            animal.setZoologico(zoologico);
            animal.imprime();
        }

    }
}
