package com.estudo.arquivos.poo03.revisao.estatico05.metodoestatico03.teste;

import com.estudo.arquivos.poo03.revisao.estatico05.metodoestatico03.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        Carro.setMarca("Ferrari");

        carro1.setModelo("488 GTB");
        carro1.imprime();

        System.out.println("--------");

        carro2.setModelo("SF90 Stradale");
        carro2.imprime();
    }
}
