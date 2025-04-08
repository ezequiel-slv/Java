package com.estudo.arquivos.revisao.revisaopoo.classes.teste;

import com.estudo.arquivos.revisao.revisaopoo.classes.dominio.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario pessoa1 = new Funcionario();
        Funcionario pessoa2 = new Funcionario();
        Funcionario pessoa3 = new Funcionario();
        Funcionario resultado = new Funcionario();

        pessoa1.nome = "Roberval";
        pessoa1.idade = 40;
        pessoa1.salario = 2500;

        pessoa1.mostrarDados();

        pessoa2.nome = "Dina";
        pessoa2.idade = 30;
        pessoa2.salario = 3000;

        pessoa2.mostrarDados();

        pessoa3.nome = "Claudio";
        pessoa3.idade = 44;
        pessoa3.salario = 4500;

        pessoa3.mostrarDados();

        resultado.mostrarResultado(pessoa1, pessoa2, pessoa3);
    }
}
