package com.estudo.arquivos.revisao.exercicos.exercicio1;

import com.estudo.arquivos.revisao.exercicos.dominio.Funcionario;

public class ExercicioFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Funcionario media = new Funcionario();

        funcionario.nome = "Ezequiel";
        funcionario.idade = 22;
        funcionario.salario = 1300;
        funcionario.salario2 = 1500;
        funcionario.salario3 = 1700;

        media.media = 1300 + 1500 + 1700 / 3;

        funcionario.imprimeSalario();
        media.imprimeMediaSalario();

    }


}
