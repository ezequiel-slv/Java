package com.estudo.arquivos.revisao.revisaopoo.estatico.teste;

import com.estudo.arquivos.revisao.revisaopoo.estatico.dominio.Curso;

public class TesteCurso {
    public static void main(String[] args) {
      Curso curso = new Curso("Spring em acão", 70);

      Curso.setContadorCursos(3);
      Curso.totalCursos(30);
      curso.imprimir();
    }
}
