package com.estudo.arquivos.poo02.enumeracao10.dominio;

public class Cliente {
    private String nome;
    private final TipoCliente tipoCliente;
    private final TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return  nome + " | " + "Código referencia: " + tipoCliente.getValor() + " | " + tipoCliente.getTipo() + " | " + "Pagamento: " + tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
