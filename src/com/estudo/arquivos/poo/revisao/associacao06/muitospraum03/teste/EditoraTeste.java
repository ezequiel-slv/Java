package com.estudo.arquivos.poo.revisao.associacao06.muitospraum03.teste;

import com.estudo.arquivos.poo.revisao.associacao06.muitospraum03.dominio.Editora;
import com.estudo.arquivos.poo.revisao.associacao06.muitospraum03.dominio.Livro;

public class EditoraTeste {
    public static void main(String[] args) {
        Livro livro1 = new Livro("1984", "George Orwell");
        Livro livro2 = new Livro("1984", "George Orwell");
        Livro livro3 = new Livro("1984", "George Orwell");

        Livro[] livros = {livro1, livro2, livro3};
        Editora editora = new Editora("Companhia das letras", livros);
        editora.imprime();
    }
}
