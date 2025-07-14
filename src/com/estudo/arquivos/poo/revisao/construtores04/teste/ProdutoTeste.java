package com.estudo.arquivos.poo.revisao.construtores04.teste;

import com.estudo.arquivos.poo.revisao.construtores04.dominio.Produto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 3500);
        Produto produto2 = new Produto("Smartphone", 2200, 10, "Eletrônicos");

        produto.imprime();
        System.out.println("----");
        produto2.imprime();
    }
}
