package com.estudo.arquivos.poo.revisao.exception14.customexception.dominio;

public class InvalidLogin extends Exception{
    public InvalidLogin() {
        super("Login inválido");
    }

    public InvalidLogin(String message) {
        super(message);
    }
}
