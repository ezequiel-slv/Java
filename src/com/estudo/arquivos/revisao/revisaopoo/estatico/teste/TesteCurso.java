package com.estudo.arquivos.revisao.revisaopoo.estatico.teste;

import com.estudo.arquivos.revisao.revisaopoo.estatico.dominio.Curso;

public class TesteCurso {
    public static void main(String[] args) {
      Curso curso1 = new Curso("Spring em acão", 30);
      Curso curso2 = new Curso("Spring Boot e Java", 70);
      
      Curso.setTotalCursos(30);
      System.out.println(Curso.getContadorCursos());
      curso1.imprimir();
      curso2.imprimir();
    }
}
