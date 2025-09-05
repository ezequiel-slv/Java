package com.estudo.arquivos.poo03.revisao.heranca08.dominio.subdominio3;

public class Pessoa {
    private String nome;
    private String cpf;
    private String datanascimento;

    public void imprimir(){
        System.out.println("Nome; " + this.nome);
        System.out.println("CPF; " + this.cpf);
        System.out.println("Data de Nascimento; " + this.datanascimento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }
}
