package controle;

import java.util.Scanner;
import modelo.Cliente;
import modelo.Animal;

public class Programa{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cliente: ");
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("CPF: ");
        String cpf = sc.nextLine();

        Cliente cliente = new Cliente(cpf, nome);

        System.out.println("Animais: ");
        for(int i = 0; i < 3; i++){
            System.out.println("Nome: ");
            nome = sc.nextLine();
            System.out.println("Raça");
            String raca = sc.nextLine();

            Animal animal = new Animal(nome,raca);
            cliente.addAnimal(animal);
        }

        System.out.println("Animais do cliente "+ cliente.getNome());
        for(Animal animal : cliente.getAnimais()){
            System.out.println("Nome: " + animal.getNome());
            System.out.println("Raça: "+ animal.getRaca());
        }
    }
}