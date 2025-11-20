package com.estudo.arquivos.poo03.revisao.exception14.dominio;

public class LoginInvalido extends Exception {
    public LoginInvalido() {
        System.out.println("Login inválido!");
    }

    public LoginInvalido(String message) {
        super(message);
    }
}
