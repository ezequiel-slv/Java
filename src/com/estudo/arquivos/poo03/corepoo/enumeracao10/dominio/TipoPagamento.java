package com.estudo.arquivos.poo03.corepoo.enumeracao10.dominio;

public enum TipoPagamento {
    DEBITO{
        @Override
        public double calcularDesconto(double desconto) {
            return desconto * 0.1;
        }
    },
    CREDITO{
        @Override
        public double calcularDesconto(double desconto) {
            return desconto * 0.5;
        }
    };

    public abstract double calcularDesconto(double desconto);
}
