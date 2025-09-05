package com.estudo.arquivos.exception04.revisao.dominio.servico;

import com.estudo.arquivos.exception04.revisao.dominio.Animal;
import com.estudo.arquivos.exception04.revisao.dominio.Cachorro;

public class AnimalSom {
    public static void somAnimal(Animal animal){
        if (animal instanceof Cachorro cachorro){
            System.out.println(cachorro.getSom());
        }else{
            System.out.println("Não é um cachorro");
        }
    }
}
