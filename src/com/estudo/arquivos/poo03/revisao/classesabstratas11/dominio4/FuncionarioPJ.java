package com.estudo.arquivos.poo03.revisao.classesabstratas11.dominio4;

public class FuncionarioPJ extends Funcionario{
    private Cargo cargo;

    public FuncionarioPJ(String nome, double salarioBase, Cargo cargo) {
        super(nome, salarioBase);
        this.cargo = cargo;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Csrgo: " + cargo.getNomeCargo());
        System.out.printf("Salário Total: %.3f\n", calcularBonus());
    }

    @Override
    public double calcularBonus() {
        return getSalarioBase() + getSalarioBase() * cargo.getBonusCargo();
    }
}
