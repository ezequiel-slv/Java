package com.revisao.arquivos.poo02.associacao06.muitosparaum03.teste;

import com.revisao.arquivos.poo02.associacao06.muitosparaum03.dominio.Jogador;
import com.revisao.arquivos.poo02.associacao06.muitosparaum03.dominio.Time;


public class JogadorTeste {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Romário");
        Jogador jogador2 = new Jogador("Neymar");
        Jogador jogador3 = new Jogador("Ronaldo");

        Jogador[] jogadores = new Jogador[]{jogador1, jogador2,  jogador3};

        Time time  = new Time("Seleção Brasileira");



    }
}
