package com.estudo.arquivos.poo.polimorfismo.teste;

import com.estudo.arquivos.poo.polimorfismo.repositorio.Repositorio;
import com.estudo.arquivos.poo.polimorfismo.repositorio.RepositorioArquivo;
import com.estudo.arquivos.poo.polimorfismo.repositorio.RepositorioBancoDeDados;
import com.estudo.arquivos.poo.polimorfismo.repositorio.RepositorioMemoria;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
