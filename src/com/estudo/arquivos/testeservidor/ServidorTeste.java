package com.estudo.arquivos.testeservidor;

import java.net.InetAddress;

public class ServidorTeste {
    public static void main(String[] args) {
        String endereco = "62.157.140.133";

        try {
            InetAddress address = InetAddress.getByName(endereco);

            System.out.println("Testando endereço: " + endereco);

            long inicio = System.currentTimeMillis();
            boolean timeout = address.isReachable(5000);
            long fim = System.currentTimeMillis();

            if (timeout) {
                System.out.println("Tempo de busca: " + (fim - inicio) + "ms");
            } else {
                System.out.println("Erro ao buscar endereço!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
