package com.estudo.arquivos.poo03.revisao.heranca08.dominio.subdominio5;

public class Vendedor extends Funcionario{

    private final double comissao = 3000;
    public Vendedor(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double calcSalario(double salario) {
        return super.calcSalario(salario) + (comissao);
    }

    @Override
    public void imprimir() {
        super.imprimir();
    }
}
