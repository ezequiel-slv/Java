package com.estudo.arquivos.poo.corepoo.polimorfismo13.teste;

import com.estudo.arquivos.poo.corepoo.polimorfismo13.repositorio.Repositorio;
import com.estudo.arquivos.poo.corepoo.polimorfismo13.repositorio.RepositorioBancoDeDados;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
