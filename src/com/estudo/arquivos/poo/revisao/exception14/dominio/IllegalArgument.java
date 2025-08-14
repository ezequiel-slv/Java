package com.estudo.arquivos.poo.revisao.exception14.dominio;

public class IllegalArgument {
    private boolean conectada = false;

    public void conectada(){
        conectada = true;
        System.out.println("Conectado");
    }

    public void enviarDados(String dados){
        if (!conectada){
            throw new IllegalStateException("Erro: conexão não iniciada");
        }
        System.out.println("Enviando dados: " + dados);
    }
}
