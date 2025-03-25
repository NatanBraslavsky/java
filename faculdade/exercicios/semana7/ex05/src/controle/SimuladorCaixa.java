package controle;
import java.util.Scanner;
import dominio.CaixaEletronico;

public class SimuladorCaixa {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        CaixaEletronico caixa = new CaixaEletronico();
        int escolha;

        do {
            System.out.print("\nSelecione a opção:\n1- Sacar\n2- Ver Saldo\n3- Sair\nEscolha: ");
            escolha = sc.nextInt();
            Thread.sleep(100);

            switch (escolha) {
                case 1:
                    System.out.print("Valor saque: ");
                    double saqueValor = sc.nextDouble();
                    caixa.sacar(saqueValor);
                    Thread.sleep(300);
                    break;

                case 2:
                    System.out.println("Saldo: R$" + caixa.getSaldo());
                    Thread.sleep(300);
                    break;

                case 3:
                    System.out.println("Saindo...");
                    Thread.sleep(300);
                    break;

                default:
                    System.out.println("Digite um valor válido.");
                    Thread.sleep(300);
            }
        } while (escolha != 3);

        sc.close();
    }
}
