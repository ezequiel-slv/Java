package com.estudo.arquivos.poo03.corepoo.modificadorfinal09.dominio;

public class Pagamento {
    private double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public final void validarTransacao(){
        System.out.println("Transação validada com sucesso.");
    }

    public void processarPagamento(){
        System.out.println("Pagamento via cartão de crédito: R$" + getValor());
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
