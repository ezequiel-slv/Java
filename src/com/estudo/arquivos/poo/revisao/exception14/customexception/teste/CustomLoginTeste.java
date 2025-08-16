package com.estudo.arquivos.poo.revisao.exception14.customexception.teste;

import com.estudo.arquivos.poo.revisao.exception14.customexception.dominio.InvalidLogin;
import com.estudo.arquivos.poo.revisao.exception14.customexception.dominio.Login;

public class CustomLoginTeste {
    public static void main(String[] args) {
        Login login = new Login();
        try {
            login.Logar();
        } catch (InvalidLogin e) {
            throw new RuntimeException(e);
        }
    }
}
