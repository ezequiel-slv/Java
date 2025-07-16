package com.estudo.arquivos.poo.revisao.estatico05.modificadorestatico02.teste;

import com.estudo.arquivos.poo.revisao.estatico05.modificadorestatico02.dominio.Estacionamento;

public class EstacionamentoTeste {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();
        Estacionamento estacionamento2 = new Estacionamento();
        Estacionamento estacionamento3 = new Estacionamento();

        System.out.println("----");

        estacionamento.sair();

    }
}
