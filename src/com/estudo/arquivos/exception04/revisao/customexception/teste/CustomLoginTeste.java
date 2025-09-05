package com.estudo.arquivos.exception04.revisao.customexception.teste;

import com.estudo.arquivos.exception04.revisao.customexception.dominio.InvalidLogin;
import com.estudo.arquivos.exception04.revisao.customexception.dominio.Login;

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
