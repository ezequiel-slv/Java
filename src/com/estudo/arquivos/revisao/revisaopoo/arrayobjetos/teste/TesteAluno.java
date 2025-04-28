package com.estudo.arquivos.revisao.revisaopoo.arrayobjetos.teste;

import com.estudo.arquivos.revisao.revisaopoo.arrayobjetos.dominio.Aluno;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Mariana", 8);
        Aluno aluno2 = new Aluno("Roberto", 8);
        Aluno[] alunos = {aluno1, aluno2};

        System.out.println("----Dados dos alunos----");
        for (Aluno aluno : alunos) {
            aluno.imprimirDados();
            aluno.avaliar();
            System.out.println("----------------");
        }
    }
}
