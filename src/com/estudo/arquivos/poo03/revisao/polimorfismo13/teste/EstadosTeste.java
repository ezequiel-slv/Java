package com.estudo.arquivos.poo03.revisao.polimorfismo13.teste;

import com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio3.Brasilia;
import com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio3.Maranhao;
import com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio3.Pais;
import com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio3.RioDeJaneiro;

public class EstadosTeste {
    public static void main(String[] args) {
        Pais maranhao = new Maranhao("Maranhão", "6.776.699", 404);
        Pais brasilia = new Brasilia("Brasília", "2.817.381", 65);
        Pais rioDeJaneiro = new RioDeJaneiro("Rio De Janeiro", "16.055.174", 460);

        maranhao.imprimir();
        brasilia.imprimir();
        rioDeJaneiro.imprimir();

    }
}
