package controller;

import model.PessoaFisica;
import model.PessoaJuridica;

import java.util.Scanner;

public class ControleCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CADASTRO DE CLIENTE");
        System.out.print("Digite o CPF/CNPJ: ");
        String c = sc.nextLine();
        System.out.print("Digite o nome/razão social: ");
        String descricao = sc.nextLine();
        System.out.print("Digite o endereço: ");
        String endereco = sc.nextLine();
        System.out.print("Digite o telefone: ");
        String telefone = sc.nextLine();
        System.out.println("Digite 1 para PF e 2 para PJ: ");
        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                PessoaFisica pf = new PessoaFisica(endereco, telefone, c, descricao);
                System.out.println("CLIENTE CADASTRADO.\n");
                System.out.printf("CPF: %s\n", pf.formatarRegistro());
                System.out.printf("Nome: %s\n", pf.getNome());
                System.out.printf("Endereço: %s\n", pf.getEndereco());
                System.out.printf("Telefone: %s\n", pf.formatarTelefone());
                break;
            case 2:
                PessoaJuridica pj = new PessoaJuridica(endereco, telefone, c, descricao);
                System.out.println("CLIENTE CADASTRADO\n");
                System.out.printf("CNPJ: %s\n", pj.formatarRegistro());
                System.out.printf("Razão Social: %s\n", pj.getRazaoSocial());
                System.out.printf("Endereço: %s\n", pj.getEndereco());
                System.out.printf("Telefone: %s\n", pj.formatarTelefone());
                break;

                // 1- qual a diferença entre o metodo concreto e abstrato.porque a classe abstrata pode forçar a implementação de metodos nas subclasses
        }
    }
}
