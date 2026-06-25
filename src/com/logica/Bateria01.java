package com.logica;

public class Bateria01 {
    public static void main(String[] args) {
        PrimeirosPassos();
        Comentarios();
        TiposDeDados();
        ConversaoDeTipos();

    }

    public static void PrimeirosPassos(){
        System.out.println("-----------");
        System.out.println("Meu nome é Ezequiel");
    }

    public static void Comentarios(){
        System.out.println("-----------");
        // Comentário de linha: usado para fazer uma explanação breve

        /*
        Comentário de bloco: mais usado para explicações longas
         */

        /**
         * Comentário de documentação: como o nome já diz
         * é util para gerar arquivos de documentação automática
         */

        System.out.println("Comentários adicionados e explicados");
    }

    public static void TiposDeDados(){
        System.out.println("-----------");
        int idade = 25;
        double altura = 1.75;
        char inicial = 'E';
        boolean estudante = true;

        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Inicial: " + inicial);
        System.out.println("Estudante: " + estudante);
    }

    public static void ConversaoDeTipos(){
        System.out.println("-----------");
        
        double numD = 3.3;
        int numI = (int) numD; // conversão explícita

        int inteiro = 10;
        double doubleN = inteiro; // conversão implícita

        System.out.println("double para int: " + numI);
        System.out.println("int para double: " + doubleN);

    }
}


