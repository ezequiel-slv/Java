package com.estudo.arquivos.poo.revisao.construtores04.teste;

import com.estudo.arquivos.poo.revisao.construtores04.dominio2.FormaDePagamento;
import com.estudo.arquivos.poo.revisao.construtores04.dominio2.Pedido;
import com.estudo.arquivos.poo.revisao.construtores04.dominio2.StatusPedido;

public class CompraTeste {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setNome("Notebook");
        pedido.setDescricao("Notebook Lenovo Ideaped 1i, Linux, I5 1245U");
        pedido.setFormaDePagamento(FormaDePagamento.DEBITO);
        pedido.setId(3);
        pedido.setStatusPedido(StatusPedido.PROCESSANDO);
        pedido.imprimir();
    }
}
