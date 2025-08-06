import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int qtd = 0;
        for(int i = 0; i < 10; i++){
            System.out.print("Digite um número: ");
            int num = sc.nextInt();
            nums.add(num);
        }
        System.out.print("Digite um número para ver a ocorrência do mesmo: ");
        int ocorrencia = sc.nextInt();
        for(int num : nums){
            if(num == ocorrencia){
                qtd++;
            }
        }
        System.out.println("qtd: "+ qtd);
    }
}

/*Exercício 4: Contagem de Ocorrências de um Número
Descrição:
Desenvolva um programa que solicite ao usuário inserir 10 números inteiros em
um ArrayList<Integer>. Depois, peça ao usuário para digitar um número e informe
quantas vezes esse número aparece na lista.
        Requisitos:
        • Criar um ArrayList<Integer> para armazenar os números.
• Utilizar um loop for para contar quantas vezes o número aparece na lista.
• Exibir a quantidade de ocorrências do número digitado pelo usuário.*/