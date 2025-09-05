package com.estudo.arquivos.poo03.corepoo.associacao06.umparamuitos.teste;

import com.estudo.arquivos.poo03.corepoo.associacao06.umparamuitos.dominio.Aluno;
import com.estudo.arquivos.poo03.corepoo.associacao06.umparamuitos.dominio.Curso;

public class AlunoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Julia");
        Aluno aluno2 = new Aluno("Ezequiel");
        Curso curso = new Curso("Ciência da Computação");
        Aluno[] alunos = {aluno1, aluno2};
        for (Aluno aluno : alunos) {
            aluno.setCurso(curso);
            aluno.imprime();
        }
    }
}
