package com.estudo.arquivos.poo.blocodeinicializacao.teste;

import com.estudo.arquivos.poo.blocodeinicializacao.dominio.ClienteBanco;

public class TesteBanco {
    public static void main(String[] args) {
        ClienteBanco cliente = new ClienteBanco("Ezequiel");

        System.out.println("Cliente: " +cliente.getCliente());
        System.out.println("número da conta: " +cliente.getNumeroConta());
    }
}
