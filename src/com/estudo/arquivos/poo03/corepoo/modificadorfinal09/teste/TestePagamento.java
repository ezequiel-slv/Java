package com.estudo.arquivos.poo03.corepoo.modificadorfinal09.teste;

import com.estudo.arquivos.poo03.corepoo.modificadorfinal09.dominio.CartaoCredito;

public class TestePagamento {
    public static void main(String[] args) {
        CartaoCredito cartaoCredito = new CartaoCredito(3000);
        cartaoCredito.processarPagamento();
        cartaoCredito.validarTransacao();
    }
}
