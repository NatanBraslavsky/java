package controle;
import dominio.ContaBancaria;
import java.util.Scanner;

public class GerenciadorConta {
    public static void main(String[] args) throws InterruptedException {
        ContaBancaria conta = new ContaBancaria();
        Scanner sc = new Scanner(System.in);
        while (true){
            Thread.sleep(1000);
            System.out.print("\n\nDigite uma opção\n\n1-Depositar\n2-Sacar\n3-Ver saldo\n4-Encerrar\n\nEscolha: ");
            int opcao = sc.nextInt();
            switch (opcao){
                case 1:

                    System.out.print("Digite o valor do deposito R$");
                    double valorDeposito = sc.nextDouble();
                    conta.depositar(valorDeposito);
                    System.out.println("Depositando...");
                    Thread.sleep(1000);
                    System.out.println("Deposito concluido.");
                    Thread.sleep(500);
                    break;

                case 2:

                    System.out.print("Digite o valor para o saque R$");
                    double valorSaque = sc.nextDouble();
                    if(valorSaque > conta.saldo){
                        System.out.printf("Você possui R$%.2f, Tente novamente.", conta.saldo);
                        Thread.sleep(1000);
                    }
                    else{
                        conta.sacar(valorSaque);
                        System.out.println("Sacando...");
                        Thread.sleep(1000);
                        System.out.println("Saque concluido");
                        Thread.sleep(500);
                    }
                    break;

                case 3:
                    conta.exibirValor();
                    Thread.sleep(1000);
                    break;

                case 4:
                    System.out.println("Finalizando...");
                    break;

                default:
                    System.out.println("Digite um valor válido.");
            }
            if(opcao == 4){
                break;
            }
        }
    }
}
