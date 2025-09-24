package com.estudo.arquivos.exception04.coreexception.dominio.servico;

import com.estudo.arquivos.exception04.coreexception.dominio.Animal;
import com.estudo.arquivos.exception04.coreexception.dominio.Cachorro;

public class AnimalSom {
    public static void somAnimal(Animal animal){
        if (animal instanceof Cachorro){
            Cachorro cachorro = (Cachorro) animal;
            System.out.println(cachorro.getSom());
        }else{
            System.out.println("Não é um cachorro");
        }
    }
}
