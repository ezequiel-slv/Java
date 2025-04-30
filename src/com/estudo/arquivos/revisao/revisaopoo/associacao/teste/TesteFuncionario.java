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
        
        empresa.setFuncionarios(funcionarios);
        for (Funcionario funcionario : funcionarios) {
            funcionario.imprime();
        }

        System.out.println("--- Empresa ---");

        empresa.imprime();

    }
}
