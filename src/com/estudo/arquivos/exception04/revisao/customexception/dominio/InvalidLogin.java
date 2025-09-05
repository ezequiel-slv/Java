package com.estudo.arquivos.exception04.revisao.customexception.dominio;

public class InvalidLogin extends Exception{
    public InvalidLogin() {
        super("Login inválido");
    }

    public InvalidLogin(String message) {
        super(message);
    }
}
