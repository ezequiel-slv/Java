package com.estudo.arquivos.poo03.revisao.estatico05.exercicio.teste;

import com.estudo.arquivos.poo03.revisao.estatico05.exercicio.dominio.Config;
import com.estudo.arquivos.poo03.revisao.estatico05.exercicio.dominio.Usuario;

public class TesteStatic {
    public static void main(String[] args) {
        Config.mostrarVersao();
        Usuario user = new Usuario();
        Usuario user2 = new Usuario();
        Usuario user3 = new Usuario();
        Usuario.showUser();

    }
}
