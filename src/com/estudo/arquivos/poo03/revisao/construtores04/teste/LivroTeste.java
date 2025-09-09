package com.estudo.arquivos.poo03.revisao.construtores04.teste;

import com.estudo.arquivos.poo03.revisao.construtores04.dominio.Livro;

public class LivroTeste {
    public static void main(String[] args) {
        Livro livro = new Livro("Fundação", "Isaac Asimov", 1951);
        livro.imprimir();
    }
}
