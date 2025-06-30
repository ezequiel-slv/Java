package com.estudo.arquivos.poo.src.enumeracao10.teste;

import com.estudo.arquivos.poo.src.enumeracao10.dominio.Cliente;
import com.estudo.arquivos.poo.src.enumeracao10.dominio.TipoCliente;
import com.estudo.arquivos.poo.src.enumeracao10.dominio.TipoPagamento;

public class TesteCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Cliente", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Cliente", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        Cliente[] clientes = {cliente1, cliente2};

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(300));
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(300));

        TipoCliente tipoCliente = TipoCliente.tipoClienteTemTipo("Pessoa Juridica");
        System.out.println(tipoCliente);

    }
}
