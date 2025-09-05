package com.estudo.arquivos.poo03.revisao.heranca08.dominio.subdominio2;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected char sexo;
    protected long cpf;
    protected Endereco endereco;
    public void imprimir2(){
        System.out.println("------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " +  endereco.getRua() + " | " + "Cep: " + endereco.getCep());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
