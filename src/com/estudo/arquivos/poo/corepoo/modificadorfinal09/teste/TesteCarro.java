package com.estudo.arquivos.poo.corepoo.modificadorfinal09.teste;

import com.estudo.arquivos.poo.corepoo.modificadorfinal09.dominio.Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setCarro("Honda Civic");
        carro.imprime();
        System.out.println("Velocidade limite: " + Carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("Ezequiel");
        System.out.println(carro.COMPRADOR);
    }
}
