package com.estudo.arquivos.poo.revisao.construtores04.dominio2;

public class Pedido {
    private int id;
    private String nome;
    private double preco;
    private String descricao;
    private StatusPedido statusPedido;
    private FormaDePagamento formaDePagamento;

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Forma de pagamento: " + formaDePagamento.toString());
        System.out.println("ID do produto: " + this.id);
        System.out.println("Status do pedido: " + statusPedido.toString());
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }
}
