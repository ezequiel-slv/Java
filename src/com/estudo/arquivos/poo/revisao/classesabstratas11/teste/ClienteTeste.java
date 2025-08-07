package com.estudo.arquivos.poo.revisao.classesabstratas11.teste;

import com.estudo.arquivos.poo.revisao.classesabstratas11.dominio3.Cliente;
import com.estudo.arquivos.poo.revisao.classesabstratas11.dominio3.FormaDePagamento;
import com.estudo.arquivos.poo.revisao.classesabstratas11.dominio3.TipoCliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ezequiel", 23, "625.552.923-14");
        cliente.setTipoCliente(TipoCliente.PESSOA_FISICA);
        cliente.setFormaDePagamento(FormaDePagamento.DINHEIRO);
        cliente.imprime();
    }
}
