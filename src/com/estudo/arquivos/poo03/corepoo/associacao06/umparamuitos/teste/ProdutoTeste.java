package com.estudo.arquivos.poo03.corepoo.associacao06.umparamuitos.teste;

import com.estudo.arquivos.poo03.corepoo.associacao06.umparamuitos.dominio.Categoria;
import com.estudo.arquivos.poo03.corepoo.associacao06.umparamuitos.dominio.Produto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Sabão", 8.99);
        Produto produto2 = new Produto("Buxa de Aço", 3.99);
        Categoria categoria = new Categoria("Limpeza");
        Produto[] produtos = {produto1, produto2};

        for (Produto produto : produtos) {
            produto.setCategoria(categoria);
            produto.imprime();
        }
    }
}
