package com.estudo.arquivos.poo03.revisao.modificadorfinal09.dominio;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Cadastro extends Pessoa{
    private static final LocalDateTime localDateTime = LocalDateTime.now();
    public final ArmazenarDados armazenarDados = new ArmazenarDados();
    private static final String rotulo = "Cadastro";
    private String usuarioDB;
    private String senhaDB;


    static {
        System.out.println("---- " + rotulo + " ----");
    }

    static {
        System.out.println("Sessão iniciada em: " + localDateTime);
        System.out.println("--------");
    }

    public void inittCadastro(){
        Scanner entrada = new Scanner(System.in);
        entrada.close();

        while (true){
            System.out.println("Digite o nome completo: ");
            String nome = entrada.nextLine();
            setNome(nome);

            System.out.println("Digite a data de nascimento: ");
            String dtNasc = entrada.nextLine();
            setDataNasc(dtNasc);

            System.out.println("Digite o cpf: ");
            String cpf = entrada.nextLine();
            setCpf(cpf);

            System.out.println("Digite seu sexo: ");
            char sexo = entrada.nextLine().charAt(0);
            setSexo(sexo);

            System.out.println("Digite o nome de usuário: ");
            this.usuarioDB = entrada.nextLine();

            System.out.println("Digite a senha: ");
            this.senhaDB = entrada.nextLine();



            boolean nomeVal = !nome.trim().isEmpty();
            boolean dtNascVal = !dtNasc.trim().isEmpty();
            boolean cpfVal = !cpf.trim().isEmpty();
            boolean sexoVal = sexo == 'M' || sexo == 'F';
            boolean usuarioVal = !usuarioDB.trim().isEmpty();
            boolean senhaVal = !senhaDB.trim().isEmpty();

            if (nomeVal && dtNascVal && cpfVal && sexoVal && usuarioVal && senhaVal){
                System.out.println("Cadastro bem sucedido!");
                break;
            }

        }
    }

    public void imprime(){
        super.imprime();
        System.out.println("Usuário: " + this.usuarioDB);
        System.out.println("Senha: " + this.senhaDB);
        System.out.println(armazenarDados);

    }

}
