package com.estudo.arquivos.poo03.revisao.polimorfismo13.teste;

import com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio.Mochila;
import com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio.Produto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto mochila = new Mochila("Sort Mountain", 503);
        mochila.imprime();
    }
}
