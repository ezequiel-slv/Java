package com.estudo.arquivos.poo.revisao.heranca08.dominio.subdominio3;

public class Gerente extends Funcionario{
    private String departamento;
    private double bonus;

    public void imprimir(){
        super.imprimir();
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Bônus do mês: " + this.bonus);
    }
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
