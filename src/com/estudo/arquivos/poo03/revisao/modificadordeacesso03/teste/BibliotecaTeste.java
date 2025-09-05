package com.estudo.arquivos.poo03.revisao.modificadordeacesso03.teste;

import com.estudo.arquivos.poo03.revisao.modificadordeacesso03.dominio.Biblioteca;

public class BibliotecaTeste {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.init("Machado de Assis", "Memória Póstumas de Brás Cubas", "220", "Romance");
        biblioteca.imprime();
    }
}
