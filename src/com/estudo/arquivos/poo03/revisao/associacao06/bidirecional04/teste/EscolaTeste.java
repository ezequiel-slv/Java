package com.estudo.arquivos.poo03.revisao.associacao06.bidirecional04.teste;

import com.estudo.arquivos.poo03.revisao.associacao06.bidirecional04.dominio.Aluno;
import com.estudo.arquivos.poo03.revisao.associacao06.bidirecional04.dominio.Escola;

public class EscolaTeste {
    public static void main(String[] args) {
        Escola salaA = new Escola("A");
        Escola salaB = new Escola("B");
        Escola salaC = new Escola("C");

        Escola [] salas = {salaA, salaB, salaC};

        Aluno aluno1 = new Aluno("Joana", salas);
        Aluno aluno2 = new Aluno("Mario", salas);
        Aluno aluno3 = new Aluno("Fernanda", salas);
        Aluno [] alunos = {aluno1, aluno2, aluno3};

        for (Aluno aluno : alunos) {
            System.out.println("-------");
            aluno.imprimir();
        }

        System.out.println("--------");

        System.out.println("-----");

        salaA.setAlunos(alunos);
        salaA.imprime();

        System.out.println("-----");

        salaB.setAlunos(alunos);
        salaB.imprime();

        System.out.println("-----");

        salaC.setAlunos(alunos);
        salaC.imprime();

    }
}
