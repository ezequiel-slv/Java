package com.estudo.arquivos.poo.enumeracao.dominio;

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
