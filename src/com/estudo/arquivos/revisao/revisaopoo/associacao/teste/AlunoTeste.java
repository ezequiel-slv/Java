package com.estudo.arquivos.revisao.revisaopoo.associacao.teste;

import com.estudo.arquivos.revisao.revisaopoo.associacao.dominio.Aluno;
import com.estudo.arquivos.revisao.revisaopoo.associacao.dominio.Turma;

public class AlunoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Ezequiel");
        Aluno aluno2 = new Aluno("Camila");
        Aluno[] alunos = {aluno1, aluno2};
        Turma turma = new Turma("3ºB");

        System.out.println("---Alunos---");
        aluno1.setTurma(turma);
        aluno2.setTurma(turma);

        aluno1.imprime();
        aluno2.imprime();

        System.out.println("---Turma---");
        turma.setAlunos(alunos);

        turma.imprime();

        }

    }
