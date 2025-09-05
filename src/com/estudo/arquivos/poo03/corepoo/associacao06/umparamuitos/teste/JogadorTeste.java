package com.estudo.arquivos.poo03.corepoo.associacao06.umparamuitos.teste;

import com.estudo.arquivos.poo03.corepoo.associacao06.umparamuitos.dominio.Jogador;
import com.estudo.arquivos.poo03.corepoo.associacao06.umparamuitos.dominio.Time;


public class JogadorTeste {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
