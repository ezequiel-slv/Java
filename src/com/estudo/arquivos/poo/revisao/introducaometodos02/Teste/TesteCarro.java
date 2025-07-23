package com.estudo.arquivos.poo.revisao.introducaometodos02.Teste;

import com.estudo.arquivos.poo.revisao.introducaometodos02.dominio.Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro(" Toyota Corolla", "XEI 2.0 Flex 16V Automático", 145.000);
        carro.imprimir();
    }
}
