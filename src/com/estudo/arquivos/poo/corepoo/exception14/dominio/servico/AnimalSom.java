package com.estudo.arquivos.poo.corepoo.exception14.dominio.servico;

import com.estudo.arquivos.poo.corepoo.exception14.dominio.Animal;
import com.estudo.arquivos.poo.corepoo.exception14.dominio.Cachorro;

public class AnimalSom {
    public static void somAnimal(Animal animal){
        if (animal instanceof Cachorro cachorro){
            System.out.println(cachorro.getSom());
        }else{
            System.out.println("Não é um cachorro");
        }
    }
}
