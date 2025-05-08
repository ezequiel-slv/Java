package com.estudo.arquivos.poo.enumeracao.teste;

import com.estudo.arquivos.poo.enumeracao.dominio.Cliente;
import com.estudo.arquivos.poo.enumeracao.dominio.TipoCliente;

public class TesteCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Cliente 1", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Cliente 2", TipoCliente.PESSOA_JURIDICA);
        Cliente[] clientes = {cliente1, cliente2};
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

    }
}
