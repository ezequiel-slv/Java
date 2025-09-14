package com.estudo.arquivos.poo03.revisao.associacao06.umparaum00.teste;

import com.estudo.arquivos.poo03.revisao.associacao06.umparaum00.dominio.Jogador;
import com.estudo.arquivos.poo03.revisao.associacao06.umparaum00.dominio.Time;

public class TimeTeste {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Neymar");
        Time t1 = new Time("Santos FC");

        j1.setTime(t1);
        j1.imprimir();

        System.out.println("-------");

        t1.setJogador(j1);
        t1.imprimir();

    }
}
