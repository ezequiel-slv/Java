package com.estudo.arquivos.poo03.revisao.classesabstratas11.dominio4;

public class FuncionarioCLT extends Funcionario{
    private Cargo cargo;

    public FuncionarioCLT(String nome, double salarioBase, Cargo cargo) {
        super(nome, salarioBase);
        this.cargo = cargo;
    }

    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Cargo: " + cargo.getNomeCargo());
        System.out.println("Salário total: " + calcularBonus());
    }

    @Override
    public double calcularBonus() {
        return getSalarioBase() + getSalarioBase() * cargo.getBonusCargo();
    }
}
