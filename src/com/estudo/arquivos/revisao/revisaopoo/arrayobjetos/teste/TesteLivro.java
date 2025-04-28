package com.estudo.arquivos.revisao.revisaopoo.arrayobjetos.teste;

import com.estudo.arquivos.revisao.revisaopoo.arrayobjetos.dominio.Livro;

public class TesteLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Miguel de Cervantes", "Dom Quixote");
        Livro livro2 = new Livro("George Orwell", "1984");
        Livro livro3 = new Livro("Gabriel García Márquez", "Cem Anos de Solidão");
        Livro[] livros = {livro1, livro2, livro3};

        for (Livro livro : livros) {
            livro.imprimeLivros();
        }
    }
}
