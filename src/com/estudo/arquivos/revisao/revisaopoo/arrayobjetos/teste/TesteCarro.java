package com.estudo.arquivos.revisao.revisaopoo.arrayobjetos.teste;

import com.estudo.arquivos.revisao.revisaopoo.arrayobjetos.dominio.Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Ford Mustang GT", 2020);
        Carro carro2 = new Carro("Toyota Corolla", 2022);
        Carro[] carros = {carro1, carro2};

        carro2.setAno(2002);
        System.out.println("----Garagem----");
        for (Carro carro : carros) {
            carro.imprimeCarro();
        }
    }
}
