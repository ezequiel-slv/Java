package com.estudo.arquivos.poo.revisao.enumeracao10.dominio;

public class Cliente extends Pessoa{
private TipoCliente tipoCliente;
private TipoPagamento tipoPagamento;

    public Cliente(String nome, int idade, String cpf, char sexo, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        super(nome, idade, cpf, sexo);
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Tipo Cliente: " + tipoCliente);
        System.out.println("Tipo Pagamento: " + tipoPagamento);
    }
}
