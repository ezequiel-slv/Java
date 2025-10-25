package com.estudo.arquivos.poo03.revisao.classesabstratas11.dominio4;

public class FuncionarioCLT extends Funcionario{
    private Cargo cargo;
    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Salário: " + );
        calcularBonus();
    }

    @Override
    public void calcularBonus() {
        this.salarioBase = salarioBase * 0.1;
    }
}
