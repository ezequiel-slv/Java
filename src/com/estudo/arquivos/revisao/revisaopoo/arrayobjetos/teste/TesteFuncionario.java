package com.estudo.arquivos.revisao.revisaopoo.arrayobjetos.teste;

import com.estudo.arquivos.revisao.revisaopoo.arrayobjetos.dominio.Funcionario;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Fabiana", 2.300);
        Funcionario funcionario2 = new Funcionario("Josivaldo", 3.000);
        Funcionario[] funcionarios = {funcionario1, funcionario2};

        System.out.println("----Funcionarios----");
        for (Funcionario funcionario : funcionarios) {
            funcionario.imprimirDados();
            funcionario.acrescimo();
            System.out.println("-------------");
        }

    }
}
