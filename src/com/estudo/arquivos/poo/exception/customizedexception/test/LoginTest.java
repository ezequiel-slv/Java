package com.estudo.arquivos.poo.exception.customizedexception.test;

import com.estudo.arquivos.poo.exception.customizedexception.domain.Login;

import java.util.Scanner;

public class LoginTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (Login e) {
            throw new RuntimeException(e);
        }
    }

    public static void logar() throws Login{
        Scanner entrada = new Scanner(System.in);
        String usuarioDB = "Ezequiel";
        String senhaDB = "010100";
        String usuarioDigitada = entrada.nextLine();
        String senhaDigitada = entrada.nextLine();

        if (!usuarioDB.equals(usuarioDigitada) || !senhaDB.equals(senhaDigitada)){
            throw new Login("Usuário ou senha inválidos");
        }
        System.out.println("Login efetuado com sucesso!");
    }

}
