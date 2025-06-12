package view;

import controller.VeiculoController;
import model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VeiculoController controller = new VeiculoController();
        int opcao;

        do {
            System.out.println("\n1 - Cadastrar novo veículo");
            System.out.println("2 - Listar veículos");
            System.out.println("3 - Sair");
            System.out.print(">> ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Tipo (1-Carro, 2-Moto, 3-Caminhão): ");
                int tipo = sc.nextInt();
                sc.nextLine();

                System.out.print("Modelo: ");
                String modelo = sc.nextLine();

                System.out.print("Placa: ");
                String placa = sc.nextLine();

                System.out.print("Ano: ");
                int ano = sc.nextInt();
                sc.nextLine();

                if (tipo == 1) {
                    System.out.print("Quantidade de portas: ");
                    int portas = sc.nextInt();
                    sc.nextLine();
                    controller.adicionarVeiculo(new Carro(placa, modelo, ano, portas));
                } else if (tipo == 2) {
                    System.out.print("Cilindrada: ");
                    int cilindrada = sc.nextInt();
                    sc.nextLine();
                    controller.adicionarVeiculo(new Moto(placa, modelo, ano, cilindrada));
                } else if (tipo == 3) {
                    System.out.print("Capacidade de carga (em toneladas): ");
                    double carga = sc.nextDouble();
                    sc.nextLine();
                    controller.adicionarVeiculo(new Caminhao(placa, modelo, ano, carga));
                }
            } else if (opcao == 2) {
                for (Veiculo v : controller.listarVeiculos()) {
                    v.exibirDados();
                }
            }

        } while (opcao != 3);

        sc.close();
    }
}
