package com.estudo.arquivos.poo03.revisao.exception14.teste;

import com.estudo.arquivos.poo03.revisao.exception14.dominio.LoginInvalido;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        try {
            login();
        } catch (LoginInvalido e) {
            e.printStackTrace();
        }
    }

    public static void login() throws LoginInvalido{
        Scanner entrada = new Scanner(System.in);

        String usuario = "Saitama";
        String senha = "opm";

        System.out.println("Digite o usuário: ");
        String user = entrada.nextLine();

        System.out.println("Digite a senha: ");
        String password = entrada.nextLine();

        boolean usuarioInvalido = !usuario.equals(user);
        boolean senhaInvalida = !senha.equals(password);

        if (usuarioInvalido || senhaInvalida){
            throw new LoginInvalido("Usuário ou Senha inválidos");
        }else{
            System.out.println("Login bem sucedido!");
        }
        entrada.close();
    }
}
