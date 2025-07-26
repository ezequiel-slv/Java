package com.estudo.arquivos.poo.revisao.associacao06.bidirecional04.teste;

import com.estudo.arquivos.poo.revisao.associacao06.bidirecional04.dominio.EscolaDeMusica;
import com.estudo.arquivos.poo.revisao.associacao06.bidirecional04.dominio.Professor;

public class EscolaDeMusicaTeste {
    public static void main(String[] args){

        Professor professor1 = new Professor("João");
        Professor professor2 = new Professor("Juliana");
        Professor[] professor = {professor1, professor2};

        EscolaDeMusica escolaDeMusica = new EscolaDeMusica("Espaço Cultural", professor);
        escolaDeMusica.imprimir();

        System.out.println("------");

        for (Professor professores : professor) {
            professores.setEscolaDeMusica(escolaDeMusica);
            professores.imprimir();
        }







    }
}
