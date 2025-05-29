package com.estudo.arquivos.poo.exception.customizedexception.domain;

public class Login extends Exception{

    public Login() {
        System.out.println("Senha ou usuário inválido");
    }

    public Login(String message) {
        super(message);
    }
}
