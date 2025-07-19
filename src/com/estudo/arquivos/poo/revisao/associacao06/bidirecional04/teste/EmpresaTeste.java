package com.estudo.arquivos.poo.revisao.associacao06.bidirecional04.teste;

import com.estudo.arquivos.poo.revisao.associacao06.bidirecional04.dominio.Empresa;
import com.estudo.arquivos.poo.revisao.associacao06.bidirecional04.dominio.Funcionario;

public class EmpresaTeste {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João");
        Funcionario funcionario2 = new Funcionario("Julia");

        Funcionario[] funcionarios = {funcionario1, funcionario2};
        Empresa empresa = new Empresa("TechShop", funcionarios);

        empresa.imprimir();

        System.out.println("----------");

        for (Funcionario funcionario : funcionarios) {
            funcionario.setEmpresa(empresa);
            funcionario.imprimir();
        }






    }
}
