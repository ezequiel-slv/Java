package com.estudo.arquivos.poo.revisao.classesabstratas11.dominio3;

public class Cliente extends Pessoa {
    private TipoCliente tipoCliente;
    private FormaDePagamento formaDePagamento;
    public Cliente(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Tipo cliente: " + tipoCliente);
        System.out.println("Forma de pagamento: " + formaDePagamento);
        System.out.println("Valor pago: " + formaDePagamento.desconto(200));
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }
}
