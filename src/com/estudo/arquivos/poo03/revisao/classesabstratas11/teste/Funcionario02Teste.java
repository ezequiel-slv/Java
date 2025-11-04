package com.estudo.arquivos.poo03.revisao.classesabstratas11.teste;

import com.estudo.arquivos.poo03.revisao.classesabstratas11.dominio4.Cargo;
import com.estudo.arquivos.poo03.revisao.classesabstratas11.dominio4.FuncionarioCLT;

public class Funcionario02Teste {
    public static void main(String[] args) {
        FuncionarioCLT funcionarioCLT = new FuncionarioCLT("Ezequiel", 1.518, Cargo.DESENVOLVEDOR);
        funcionarioCLT.calcularBonus();
        funcionarioCLT.imprimir();
    }
}
