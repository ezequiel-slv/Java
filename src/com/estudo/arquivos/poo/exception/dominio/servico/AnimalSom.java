package com.estudo.arquivos.poo.exception.dominio.servico;

import com.estudo.arquivos.poo.exception.dominio.Animal;
import com.estudo.arquivos.poo.exception.dominio.Cachorro;

public class AnimalSom {
    public static void somAnimal(Animal animal){
        if (animal instanceof Cachorro cachorro){
            System.out.println(cachorro.getSom());
        }else{
            System.out.println("Não é um cachorro");
        }
    }
}
