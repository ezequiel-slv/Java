package com.core.exception03.revisao.dominio.servico;

import com.core.exception03.revisao.dominio.Animal;
import com.core.exception03.revisao.dominio.Cachorro;

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
