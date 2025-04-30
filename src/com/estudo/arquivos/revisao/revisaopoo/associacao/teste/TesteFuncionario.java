package com.estudo.arquivos.revisao.revisaopoo.associacao.teste;

import com.estudo.arquivos.revisao.revisaopoo.associacao.dominio.Empresa;
import com.estudo.arquivos.revisao.revisaopoo.associacao.dominio.Funcionario;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("José");
        Funcionario funcionario2 = new Funcionario("Marina");
        Funcionario funcionario3 = new Funcionario("Pedro");
        Funcionario[] funcionarios = {funcionario1, funcionario2, funcionario3};
        Empresa empresa = new Empresa("Tech Soluções");

        System.out.println("--- Funcionarios ---");


        funcionario1.setEmpresa(empresa);
        funcionario2.setEmpresa(empresa);
        funcionario3.setEmpresa(empresa);

        funcionario1.imprime();
        funcionario2.imprime();
        funcionario3.imprime();

        System.out.println("--- Empresa ---");

        empresa.setFuncionarios(funcionarios);
        empresa.imprime();

    }
}
