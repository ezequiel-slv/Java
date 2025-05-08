package com.estudo.arquivos.poo.modificadorfinal.teste;

import com.estudo.arquivos.poo.modificadorfinal.dominio.CartaoCredito;

public class TestePagamento {
    public static void main(String[] args) {
        CartaoCredito cartaoCredito = new CartaoCredito(3000);
        cartaoCredito.processarPagamento();
        cartaoCredito.validarTransacao();
    }
}
