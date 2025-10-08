package com.estudo.arquivos.poo03.revisao.heranca08.dominio.subdominio5;

public class Gerente extends Funcionario{
    private final double bonus = 0.3;

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double calcSalario(double salario) {
        return super.calcSalario(salario) + (salario * bonus);
    }

    @Override
    public void imprimir() {
        super.imprimir();
    }
}
