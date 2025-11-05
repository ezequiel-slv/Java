package com.estudo.arquivos.poo03.revisao.classesabstratas11.teste;

import com.estudo.arquivos.poo03.revisao.classesabstratas11.dominio4.Cargo;
import com.estudo.arquivos.poo03.revisao.classesabstratas11.dominio4.FuncionarioCLT;
import com.estudo.arquivos.poo03.revisao.classesabstratas11.dominio4.FuncionarioPJ;

public class Funcionario02Teste {
    public static void main(String[] args) {
        FuncionarioCLT funcionario01 = new FuncionarioCLT("Ezequiel", 1.518, Cargo.DESENVOLVEDOR);
        funcionario01.calcularBonus();
        funcionario01.imprimir();

        System.out.println("----");

        FuncionarioCLT funcionario02 = new FuncionarioCLT("Juliana", 30.000, Cargo.GERENTE);
        funcionario02.calcularBonus();
        funcionario02.imprimir();

        System.out.println("----");
        FuncionarioPJ funcionarioPJ = new FuncionarioPJ("João", 2.300, Cargo.ESTAGIARIO);
        funcionarioPJ.calcularBonus();
        funcionarioPJ.imprimir();
    }
}
