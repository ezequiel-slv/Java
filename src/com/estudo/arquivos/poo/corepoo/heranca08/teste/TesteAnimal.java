package com.estudo.arquivos.poo.corepoo.heranca08.teste;

import com.estudo.arquivos.poo.corepoo.heranca08.dominio.Cachorro;
import com.estudo.arquivos.poo.corepoo.heranca08.dominio.Tutor;

public class TesteAnimal {
    public static void main(String[] args) {
        Tutor tutor = new Tutor();
        tutor.setNome("Ezequiel");
        tutor.setCpf("625.552.923-14");
        Cachorro cachorro = new Cachorro("Cachorro","Mestiço");
        cachorro.setEspecie("Canideo");
        cachorro.setPeso("30");
        cachorro.setIdade("5 anos");
        cachorro.setTutor(tutor);
        cachorro.imprime();
    }
}
