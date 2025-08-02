package com.estudo.arquivos.poo.revisao.enumeracao10.dominio;

public enum TipoPagamento {
    CREDITO{
        @Override
        public double calcularDesconto(double valorServico) {
            return valorServico * 0.95;
        }
    },
    DEBITO{
        @Override
        public double calcularDesconto(double valorServico) {
            return valorServico * 0.9;
        }
    };

    public abstract double calcularDesconto(double valorServico);


    @Override
    public String toString() {
        return super.toString();
    }
}
