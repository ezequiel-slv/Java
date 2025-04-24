package com.estudo.arquivos.revisao.revisaopoo.estatico.dominio;

public class Curso {
    private final String nome;
    private final int horas;
    private static int totalCursos;
    private final static String tecnologia;
    private static int contadorCursos;

    static{
        System.out.println("Cursos");
        tecnologia = "Spring Boot";
    }

    public Curso(String nome, int horas){
        this.nome = nome;
        this.horas = horas;
    }

    public void imprimir(){
        System.out.println("------------------");
        System.out.println("Nome do curso: " + this.nome);
        System.out.println("Horas de curso: " + this.horas);
        System.out.println("Tecnologia: " + tecnologia);
        System.out.println("Total de cursos: " + totalCursos);
        System.out.println("Contador de cursos: " + contadorCursos);
    }

    public static void totalCursos(int totalCursos){
      Curso.totalCursos = totalCursos;
    }

    public static void setContadorCursos(int contadorCursos){
      Curso.contadorCursos = contadorCursos;
    }

}
