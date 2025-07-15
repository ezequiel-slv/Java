package com.estudo.arquivos.poo.revisao.estatico05.modificadorestatico02.teste;

import com.estudo.arquivos.poo.revisao.estatico05.modificadorestatico02.dominio.Produto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        Produto.setTipo("Eletrônico");

        produto2.setNome("Smartphone");
        produto2.setPreco(2300);
        produto2.imprime();

        System.out.println("------------");

        produto1.setNome("Notebook");
        produto1.setPreco(3000);
        produto1.imprime();
    }
}
