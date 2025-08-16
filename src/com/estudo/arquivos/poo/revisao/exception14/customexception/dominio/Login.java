package com.estudo.arquivos.poo.revisao.exception14.customexception.dominio;

import java.util.Scanner;

public class Login extends InvalidLogin{

    public void Logar() throws InvalidLogin{
        String userDB = "Ezequiel";
        String passWordDB = "123ezy";

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o usuário: ");
        String usuarioDigitado = entrada.nextLine();

        System.out.println("Digite a senha: ");
        String senhaDigitada = entrada.nextLine();

        if (!usuarioDigitado.equals(userDB) || !senhaDigitada.equals(passWordDB)){
            throw new InvalidLogin();
        }
        System.out.println("Login bem sucedido!");
    }
}
