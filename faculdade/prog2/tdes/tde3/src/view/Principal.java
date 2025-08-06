package view;

import controller.BibliotecaController;
import model.*;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BibliotecaController controller = new BibliotecaController();
        boolean executando = true;

        while (executando) {
            System.out.println("\n--- Sistema de Biblioteca ---");
            System.out.println("1. Adicionar item");
            System.out.println("2. Listar itens");
            System.out.println("3. Buscar item por título");
            System.out.println("4. Remover item");
            System.out.println("5. Sair");
            System.out.print("Escolha: ");
            String opcao = scanner.nextLine();

            try {
                switch (opcao) {
                    case "1":
                        System.out.println("Tipo (1-Livro, 2-Revista, 3-Trabalho): ");
                        String tipo = scanner.nextLine();

                        System.out.print("Título: ");
                        String titulo = scanner.nextLine();
                        System.out.print("Autor: ");
                        String autor = scanner.nextLine();
                        System.out.print("Ano: ");
                        int ano = Integer.parseInt(scanner.nextLine());

                        ItemBiblioteca item = null;
                        switch (tipo) {
                            case "1":
                                System.out.print("Editora: ");
                                String editora = scanner.nextLine();
                                item = new Livro(titulo, autor, ano, editora);
                                break;
                            case "2":
                                System.out.print("Edição: ");
                                int edicao = Integer.parseInt(scanner.nextLine());
                                item = new Revista(titulo, autor, ano, edicao);
                                break;
                            case "3":
                                System.out.print("Instituição: ");
                                String inst = scanner.nextLine();
                                item = new TrabalhoAcademico(titulo, autor, ano, inst);
                                break;
                            default:
                                System.out.println("Tipo inválido.");
                        }

                        if (item != null) controller.adicionarItem(item);
                        break;

                    case "2":
                        controller.listarItens();
                        break;

                    case "3":
                        System.out.print("Digite o título: ");
                        String busca = scanner.nextLine();
                        ItemBiblioteca encontrado = controller.buscarPorTitulo(busca);
                        encontrado.exibirDetalhes();
                        break;

                    case "4":
                        System.out.print("Título do item a remover: ");
                        String remover = scanner.nextLine();
                        controller.removerPorTitulo(remover);
                        break;

                    case "5":
                        executando = false;
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                }
            } catch (CampoVazioException | ItemNaoEncontradoException | NumberFormatException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
