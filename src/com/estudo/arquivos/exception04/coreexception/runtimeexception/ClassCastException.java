package com.estudo.arquivos.exception04.coreexception.runtimeexception;

import com.estudo.arquivos.exception04.coreexception.dominio.Animal;
import com.estudo.arquivos.exception04.coreexception.dominio.Cachorro;
import com.estudo.arquivos.exception04.coreexception.dominio.Gato;
import com.estudo.arquivos.exception04.coreexception.dominio.servico.AnimalSom;

public class ClassCastException {
    public static void main(String[] args) {
        Animal animal2 = new Cachorro("au au");
        System.out.println(animal2.getSom());

        System.out.println("---------");

        Animal animal = new Gato("Miau");
        AnimalSom.somAnimal(animal);

        /*
        ClassCastException acontece quando há incopatibilidade de classes ao tentar fazer um cast de uma classe que não está na , necessitando fazer um instanceof
         */
    }
}
