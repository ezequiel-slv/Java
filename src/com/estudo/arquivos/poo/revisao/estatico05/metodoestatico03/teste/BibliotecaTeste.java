package com.estudo.arquivos.poo.revisao.estatico05.metodoestatico03.teste;

import com.estudo.arquivos.poo.revisao.estatico05.metodoestatico03.dominio.Livro;

public class BibliotecaTeste {
    public static void main(String[] args) {
        Livro livro = new Livro();
        Livro.setNomeBiblioteca("Biblioteca Centro Cultural");
        Livro.setTipo("Romance");

        livro.setNome("Dom Casmurro");
        livro.setAutor("Machado de Assis");
        livro.setQtdPag(250);
        livro.imprimir();
    }
}
