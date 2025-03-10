package controller;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            try {
                System.out.printf("1-Entrar\n2-Cadastrar\n3-Sair\nEscolha: ");
                int opcao = sc.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.printf("Entrou.");
                        break;
                    case 2:
                        System.out.printf("Cadastrou.");
                        break;
                    case 3:
                        System.out.printf("Saiu.");
                        break;
                    default:
                        System.out.printf("Digite um valor válido\n");
                }
                if (1 <= opcao && opcao <= 3) {
                    break;
                }
            }
            catch (Exception ex){
                System.out.print("ERRO, tente novamente.\n");
                sc.next();
            }
        }
    }
}