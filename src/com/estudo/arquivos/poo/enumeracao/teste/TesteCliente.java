package com.estudo.arquivos.poo.enumeracao.teste;

import com.estudo.arquivos.poo.enumeracao.dominio.Cliente;
import com.estudo.arquivos.poo.enumeracao.dominio.TipoCliente;
import com.estudo.arquivos.poo.enumeracao.dominio.TipoPagamento;

public class TesteCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Cliente", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Cliente", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        Cliente[] clientes = {cliente1, cliente2};
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

    }
}
