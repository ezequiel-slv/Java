package com.core.poo02.estatico05.blocodeinicializacao.dominio;

public class ClienteBanco {
    private final String cliente;
    private final String numeroConta;

    {
        int codigoCadastro = (int) (Math.random() * 5)+1;
        numeroConta = "conta criada: CONTA-" + codigoCadastro;
        System.out.println(numeroConta);
    }

    public ClienteBanco(String cliente){
        this.cliente = cliente;
        System.out.println("Usuário da conta: "+ cliente);
    }

    public String getCliente(){
        return cliente;
    }
    public String getNumeroConta() {
        return numeroConta;
    }
}
