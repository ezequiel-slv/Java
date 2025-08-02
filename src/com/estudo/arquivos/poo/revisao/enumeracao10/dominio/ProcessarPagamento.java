package com.estudo.arquivos.poo.revisao.enumeracao10.dominio;

import java.util.Random;

public class ProcessarPagamento {
    private TipoPagamento tipoPagamento;

    private Cliente cliente;
    private final static int codigoProduto;

    static {
        System.out.println("----------");
        System.out.println("Processando pagamento...");
        System.out.println("Gerando código...");
        Random random = new Random();
        codigoProduto = random.nextInt(1000);
        System.out.println("Código do produto; " + codigoProduto);
        System.out.println("Pagamento concluído!");
    }

    public void imprime(){
        System.out.println("----------");
        System.out.println("Contratante: " + cliente.getNome());
        System.out.println("Tipo de pagamento: " + tipoPagamento.toString());
        System.out.println("Valor pago: " + TipoPagamento.DEBITO.calcularDesconto(500));
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
