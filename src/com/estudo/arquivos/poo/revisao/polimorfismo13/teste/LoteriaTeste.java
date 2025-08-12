package com.estudo.arquivos.poo.revisao.polimorfismo13.teste;

import com.estudo.arquivos.poo.revisao.polimorfismo13.dominio2.ConcorrenteUm;
import com.estudo.arquivos.poo.revisao.polimorfismo13.dominio2.Pessoa;
import com.estudo.arquivos.poo.revisao.polimorfismo13.dominio2.Tv;
import com.estudo.arquivos.poo.revisao.polimorfismo13.repositorio2.Repositorio2;
import com.estudo.arquivos.poo.revisao.polimorfismo13.repositorio2.SalvarMemoria;
import com.estudo.arquivos.poo.revisao.polimorfismo13.service2.RegistrarNumero;
import com.estudo.arquivos.poo.revisao.polimorfismo13.service2.Sortear;

public class LoteriaTeste {
    public static void main(String[] args) {
        Pessoa c1 = new ConcorrenteUm();
        c1.addInformacoes();
        RegistrarNumero.armazenarNumeros(c1);

        Repositorio2 repositorio2 = new SalvarMemoria();
        repositorio2.salvar();

        Tv tv = new Tv();
        Sortear.sortearNumeros(tv);
    }
}
