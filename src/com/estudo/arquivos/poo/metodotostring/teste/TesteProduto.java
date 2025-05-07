package com.estudo.arquivos.poo.metodotostring.teste;

import com.estudo.arquivos.poo.metodotostring.dominio.Produto;

public class TesteProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Celular", 2000, 1);
        System.out.println(produto);
    }
}
