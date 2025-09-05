package com.estudo.arquivos.poo03.revisao.construtores04.teste;

import com.estudo.arquivos.poo03.revisao.construtores04.dominio.Aluno;

public class AlunoTeste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Ezequiel", 23, "20231BCC0016", "Ciência da Computação");
        aluno.imprime();
    }
}
