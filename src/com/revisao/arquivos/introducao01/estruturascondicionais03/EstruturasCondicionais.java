package com.revisao.arquivos.introducao01.estruturascondicionais03;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        exe01();
        exe02();
        exe03();
        exe04();
    }

    public static void exe01(){
        //Parte 1 – Estrutura i


        System.out.println("1)");
        //1. Crie um programa que receba um número inteiro e verifique se ele é positivo.

        int num = 10;

        boolean condicao = num > 0;

        if (condicao){
            System.out.println("É positivo");
        }

        System.out.println("2)");
        //2. Receba a idade de uma pessoa e informe se ela é maior de idade (18 anos ou mais).

        int idade = 18;

        boolean condicao2 = idade >= 18;

        if (condicao2){
            System.out.println("É maior de idade");
        }

        System.out.println("3)");
        //3. Leia um número e verifique se ele é múltiplo de 5.

        int num3 = 10;

        boolean condicao3 = num3 % 5 == 0;

        if (condicao3){
            System.out.println("É multiplo de 5");
        }

        System.out.println("4)");
        //4. Receba um valor e verifique se ele está entre 10 e 50.
        int val = 35;

        boolean condicao4 = val >= 10 && val <=50;

        if (condicao4){
            System.out.println(true);
        }

        System.out.println("5)");
        //5. Leia um número e verifique se ele é par.
        int num4 = 4;

        boolean condicao5 = num4 % 2 == 0;

        if (condicao5){
            System.out.println("É par");
        }

    }

    public static void exe02(){

        System.out.println("6)");
        //        6. Receba um número e informe se ele é par ou ímpar.
        int num = 3;

        boolean cond1 = num % 2 == 0;

        if (cond1){
            System.out.println("é par");
        } else if (!cond1) {
            System.out.println("é impar");
        }

        System.out.println("7)");
        //        7. Leia dois números e informe qual deles é maior.
        int num2 = 6;
        int num3 = 5;

        boolean cond2 = num2 < num3;

        if (cond2){
            System.out.println(num2 + " é " + "menor que " + num3);
        } else if (!cond2) {
            System.out.println(num2 + " é " + "maior que " + num3);
        }

        System.out.println("8)");
        //        8. Receba a nota de um aluno e informe se ele está aprovado (nota ≥ 7) ou reprovado.
        double nota = 7.5;

        boolean cond3 = nota >= 7;

        if (cond3){
            System.out.println("Aluno aprovado");
        } else if (!cond3) {
            System.out.println("Reprovado");
        }

        System.out.println("9)");
        //        9. Receba um número e informe se ele é positivo ou negativo.
        int num4 = 7;

        boolean cond4 = num4 > 0;

        if (cond4){
            System.out.println("é positivo");
        } else if (!cond4) {
            System.out.println("é negativo");
        }

        System.out.println("10)");
        //       10. Leia o salário de uma pessoa. Se for maior que 3000, informe "Salário alto", caso contrário informe "Salário comum".
        int salario = 1500;

        boolean cond5 = salario > 3000;

        if (cond5){
            System.out.println("Salário alto");
        } else if (!cond5) {
            System.out.println("Salário comum");
        }
    }

    public static void exe03(){
//        11. Receba a nota de um aluno e classifique:
//        Nota ≥ 9 → Excelente
//        Nota ≥ 7 → Bom
//        Nota ≥ 5 → Regular
//        Abaixo de 5 → Reprovado

        System.out.println("11)");

        int nota = 8;

        String condicao = nota >= 9 ? "Excelente" : nota >= 7 ? "Bom" : nota >= 5 ? "Regular" : "Abaixo";

        System.out.println(condicao);

        System.out.println("12)");

//        12. Leia três números e informe qual é o maior deles.

        int num1 = 4;
        int num2 = 10;
        int num3 = 6;

        boolean condicao2 = num1 > num2 && num1 > num3;
        boolean condicao3 = num2 > num1 && num2 > num3;
        boolean condicao4 = num3 > num1 && num3 > num2;

        if (condicao2){
            System.out.println(num1);
        } else if (condicao3) {
            System.out.println(num2);
        }else if (condicao4) {
            System.out.println(num3);
        }

        System.out.println("13)");
//        13. Receba um número e classifique:
//        Menor que 0 → Negativo
//        Igual a 0 → Zero
//        Maior que 0 → Positivo

        int num = 21;

        String condicao5 = num < 0 ? "Negativo"
                : num == 0 ? "Zero"
                : num > 0 ? "Positivo" : "Valor inválido";

        System.out.println(condicao5);

        System.out.println("14)");
//        14. Receba a idade e classifique:
//
//        0–12 → Criança
//        13–17 → Adolescente
//        18–59 → Adulto
//        60+ → Idoso

        int idade = 23;

        if (idade > 0 && idade <= 12){
            System.out.println("Criança");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Adulto");
        }else{
            System.out.println("Idoso");
        }

        System.out.println("15)");
//        15. Receba o mês (1–12) e informe o trimestre correspondente.

        int mes = 7;
        
        if (mes > 0 && mes <= 3){
            System.out.println("Primeiro trimestre");
        } else if (mes > 3 && mes <= 6) {
            System.out.println("Segundo trimestre");
        } else if (mes > 6 && mes <= 9) {
            System.out.println("Terceiro trimestre");
        } else if (mes > 9 && mes <= 12) {
            System.out.println("Quarto trimestre");
        }
    }

    public static void exe04(){
//        16. Receba um número de 1 a 7 e informe o dia da semana correspondente.

        System.out.println("16)");

        int dia = 6;

        switch (dia){
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terca");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                break;
        }
                /*
                17. Receba uma opção:

                1 – Depositar
                2 – Sacar
                3 – Consultar saldo
                4 – Sair

                Imprima a operação escolhida.
                 */
        System.out.println("17)");

        int num = 3;

        switch (num){
            case 1:
                System.out.println("Depositar");
                break;
            case 2:
                System.out.println("Sacar");
                break;
            case 3:
                System.out.println("Consultar saldo");
                break;
            case 4:
                System.out.println("Sair");
                break;
            default:
                break;
        }

        /*
        18. Receba o mês (1–12) e informe o nome do mês usando switch.
         */

        System.out.println("18)");

        int mes = 12;

        switch (mes){
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                break;
        }

        /*
        19. Receba uma letra representando o turno:

        M → Matutino

        V → Vespertino

        N → Noturno
         */
        System.out.println("19)");

        String letra = "V";

        switch (letra){
            case "M":
                System.out.println("Matutino");
                break;
            case "V":
                System.out.println("Vespertino");
                break;
            case "N":
                System.out.println("Noturno");
                break;
            default:
                break;
        }

        /*
        20. Receba uma operação matemática (+, -, *, /) e dois números.
        Use switch para realizar a operação.
         */

        System.out.println("20");

        String op = "+";

        int num1 = 5;
        int num2 = 3;

        switch (op){
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            default:
                break;
        }
    }
}
