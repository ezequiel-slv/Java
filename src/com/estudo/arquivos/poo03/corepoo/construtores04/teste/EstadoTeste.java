package com.estudo.arquivos.poo03.corepoo.construtores04.teste;

import com.estudo.arquivos.poo03.corepoo.construtores04.dominio.Estado;

public class EstadoTeste {
    public static void main(String[] args) {
        Estado estado = new Estado("Maranhão", "São Luis", 400, 217, 99, 124981);

        estado.imprime();
    }
}
