package controle;

import java.util.Iterator;
import java.util.Scanner;
import models.Cliente;
import models.Animal;


public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char resposta = 'S';
        System.out.println("CADASTRO DE CLIENTE");
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        Cliente cliente = new Cliente(cpf, nome);

        System.out.println("CADASTRO DE ANIMAIS");
        do{
            System.out.print("Nome: ");
            String nomeAnimal = sc.nextLine();

            System.out.print("Espécie: ");
            String especie = sc.nextLine();

            System.out.print("Raça: ");
            String raca = sc.nextLine();

            Animal animal = new Animal(nomeAnimal, especie, raca);
            cliente.addAnimal(animal);

            System.out.println("Deseja cadastrar mais um animal? 's' ou 'n': ");
            resposta = sc.next().charAt(0);
            sc.nextLine();
        } while (resposta == 's');

        System.out.println("ANIMAIS DO CLIENTE "+ cliente.getNome());
//      System.out.println(cliente.getAnimais());
        Iterator<Animal> iterator = cliente.getAnimais().iterator();
        while (iterator.hasNext()){
            Animal animal = iterator.next();
            System.out.print("\n|  Nome: " + animal.getNome());
            System.out.print(" |  Espécie: " + animal.getEspecie());
            System.out.print(" |  Raça: " + animal.getRaca());
            System.out.println();
            System.out.print("-".repeat(40));
        }

    }
}
