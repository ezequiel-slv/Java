package com.estudo.arquivos.introducao.src.estruturascondicionais03;

public class EstruturasCondicionais03 {
    public static void main(String[] args) {
        //taxa em cima do salário
        // de 0 a 34,712 - 10%
        // de 34,713 a 68,587 - 37%
        // 68,588 - 50%

        double salarioAnual = 75000;
        double primeiraFaixa = 10 / 100;
        double segundaFaixa = 37 / 100;
        double terceiraFaixa = 50 / 100;
        double valorImposto;

        if (salarioAnual <= 34712){
            valorImposto = salarioAnual * primeiraFaixa;
        }else if (salarioAnual >= 34713 && salarioAnual == 68587){
            valorImposto = salarioAnual * segundaFaixa;
        }else {
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println(valorImposto);
    }
}
