package com.estudo.arquivos.poo03.revisao.heranca08.dominio.subdominio4.dominio;

public class Funcionario extends Pessoa{
    private final Setor setor;
    private final double salario;

    public Funcionario(String nome, int idade, char sexo, String cpf, Setor setor, double salario) {
        super(nome, idade, sexo, cpf);
        this.setor = setor;
        this.salario = salario;
    }

    public void imprimir(){
        super.imprimir();
        String saida = setor != null? setor.getNome() : "Setor não catalogado";
        System.out.println(saida);
        System.out.printf("Salário: %.2f\n", this.salario);
    }
}
