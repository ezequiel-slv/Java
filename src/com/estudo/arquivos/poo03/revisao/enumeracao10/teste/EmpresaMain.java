package com.estudo.arquivos.poo03.revisao.enumeracao10.teste;

import com.estudo.arquivos.poo03.revisao.enumeracao10.dominio.*;

public class EmpresaMain {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Master Tech");

        Funcionario funcionario = new Funcionario("Ezequiel", 23,
                "253.453.523-32", 'M', 4000, empresa, Setor.TI);
        funcionario.imprimir();

        System.out.println("--------");

        Cliente cliente1 = new Cliente("João", 18, "565.233.090-33", 'M',
                TipoCliente.clientePorRelatorio("Pessoa Física"), empresa, funcionario);
        cliente1.imprimir();

        ProcessarPagamento pg = new ProcessarPagamento();
        pg.setCliente(cliente1);
        pg.setTipoPagamento(TipoPagamento.DEBITO);
        pg.imprime();
    }
}
