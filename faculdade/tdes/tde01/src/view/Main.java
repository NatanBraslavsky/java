package view;

import controller.AutomovelController;
import model.Automovel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AutomovelController controller = new AutomovelController();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Incluir automóvel");
            System.out.println("2 - Remover automóvel");
            System.out.println("3 - Alterar dados de automóvel");
            System.out.println("4 - Consultar automóvel por placa");
            System.out.println("5 - Listar automóveis (ordenado)");
            System.out.println("6 - Salvar e sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1 -> {
                    System.out.print("Placa: ");
                    String placa = scanner.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Ano: ");
                    int ano = Integer.parseInt(scanner.nextLine());
                    System.out.print("Valor: ");
                    double valor = Double.parseDouble(scanner.nextLine());
                    controller.incluir(new Automovel(placa, modelo, marca, ano, valor));
                }
                case 2 -> {
                    System.out.print("Placa: ");
                    controller.remover(scanner.nextLine());
                }
                case 3 -> {
                    System.out.print("Placa: ");
                    String placa = scanner.nextLine();
                    System.out.print("Novo modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Nova marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Novo ano: ");
                    int ano = Integer.parseInt(scanner.nextLine());
                    System.out.print("Novo valor: ");
                    double valor = Double.parseDouble(scanner.nextLine());
                    controller.alterar(placa, modelo, marca, ano, valor);
                }
                case 4 -> {
                    System.out.print("Placa: ");
                    Automovel a = controller.buscar(scanner.nextLine());
                    if (a != null) {
                        System.out.println(a);
                    } else {
                        System.out.println("Automóvel não encontrado.");
                    }
                }
                case 5 -> {
                    System.out.println("Ordenar por: 1 - Placa | 2 - Modelo | 3 - Marca");
                    int tipo = Integer.parseInt(scanner.nextLine());
                    controller.listarOrdenado(tipo);
                }
                case 6 -> controller.salvar();
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 6);
    }
}
