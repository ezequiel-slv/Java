package com.estudo.arquivos.poo.revisao.modificadorfinal09.teste;

import com.estudo.arquivos.poo.revisao.modificadorfinal09.dominio.Loja;

public class LojaTeste {
    public static void main(String[] args) {
        Loja loja = new Loja();
        loja.JOGO.setNome("Mario World");
        //System.out.println(loja.JOGO);
        loja.JOGO.imprimir();
    }
}
