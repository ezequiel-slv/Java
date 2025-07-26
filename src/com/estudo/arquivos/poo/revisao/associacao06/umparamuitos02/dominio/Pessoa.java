package com.estudo.arquivos.poo.revisao.associacao06.umparamuitos02.dominio;

public class Pessoa {
    private String nome;
    private Telefone[] telefones;
    private int totalTelefones;

    public Pessoa(String nome, int maxTelefones) {
        this.nome = nome;
        this.telefones = new Telefone[maxTelefones];
        this.totalTelefones = 0;
    }

    public String getNome() {
        return nome;
    }

    public void addTelefones(Telefone telefone){
        if (totalTelefones < telefones.length){
            telefones[totalTelefones] = telefone;
            totalTelefones++;
        }else {
            System.out.println("Limite de telefones atingido");
        }
    }

    public void exibirTelefone(){
        System.out.println("Dono(a) do telefone: " + nome);
        for (int i = 0; i < telefones.length; i++) {
            telefones[i].imprimir();
        }
    }
}
