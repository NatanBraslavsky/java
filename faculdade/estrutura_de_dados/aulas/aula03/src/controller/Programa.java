package controller;

import java.util.Scanner;
import model.Cliente;
import model.Animal;


public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CADASTRO DE CLIENTE");
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        Cliente cliente = new Cliente(cpf, nome);

        System.out.println("CADASTRO DE ANIMAIS");
        for(int i = 0; i < 3; i++){
            System.out.print("Nome: ");
            String nomeAnimal = sc.nextLine();

            System.out.print("Espécie: ");
            String especie = sc.nextLine();

            System.out.print("Raça: ");
            String raca = sc.nextLine();

            Animal animal = new Animal(nomeAnimal, especie, raca);
            cliente.addAnimal(animal);
        }

        System.out.println("ANIMAIS DO CLIENTE "+ cliente.getNome());
//        System.out.println(cliente.getAnimais());
        for(Animal animal : cliente.getAnimais()){
            System.out.print("\n|  Nome " + animal.getNome());
            System.out.print("\n|  Espécie " + animal.getEspecie());
            System.out.print("\n|  Raça " + animal.getRaca());
        }
    }
}
