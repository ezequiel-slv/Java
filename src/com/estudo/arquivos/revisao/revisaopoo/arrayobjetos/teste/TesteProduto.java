package com.estudo.arquivos.revisao.revisaopoo.arrayobjetos.teste;

import com.estudo.arquivos.revisao.revisaopoo.arrayobjetos.dominio.Produto;

public class TesteProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Apple iPhone 15 ", 7000);
        Produto produto2 = new Produto("Cafeteira Nespresso Inissia", 500);
        Produto[] produtos = {produto1, produto2};

        System.out.println("----Produtos----");
        for (Produto produto : produtos) {
            produto.imprimirDados();
            produto.desconto();
            System.out.println("-------------");
        }

    }
}
