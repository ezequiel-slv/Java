package com.estudo.arquivos.poo.revisao.polimorfismo13.teste;

import com.estudo.arquivos.poo.revisao.polimorfismo13.dominio2.ConcorrenteUm;
import com.estudo.arquivos.poo.revisao.polimorfismo13.dominio2.Pessoa;
import com.estudo.arquivos.poo.revisao.polimorfismo13.service2.RegistrarNumero;

public class LoteriaTeste {
    public static void main(String[] args) {
        Pessoa c1 = new ConcorrenteUm();
        c1.addInformacoes();
        c1.imprimir();
        RegistrarNumero.armazenarNumeros(c1);
    }
}
