package com.estudo.arquivos.poo03.revisao.classesabstratas11.dominio3;

public enum FormaDePagamento {
    CREDITO("Crédito"){
        @Override
        public double desconto(double desconto) {
            return desconto + desconto * 0.05;
        }
    },
    DEBITO("Débito"){
        @Override
        public double desconto(double desconto) {
            return desconto;
        }
    },
    DINHEIRO("Boleto"){
        @Override
        public double desconto(double desconto) {
            return desconto - desconto  * 0.10;
        }
    },
    PIX("Pix"){
        @Override
        public double desconto(double desconto) {
            return desconto - desconto * 0.05;
        }
    };

    private String pagamentoFormat;
    public abstract double desconto(double desconto);

    FormaDePagamento(String pagamentoFormat) {
        this.pagamentoFormat = pagamentoFormat;
    }

    public String getPagamentoFormat() {
        return pagamentoFormat;
    }

    public void setPagamentoFormat(String pagamentoFormat) {
        this.pagamentoFormat = pagamentoFormat;
    }
}
