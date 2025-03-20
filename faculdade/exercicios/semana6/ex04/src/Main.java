import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de alunos: ");
        int qtd_alunos = sc.nextInt();
        float[] notas = new float[qtd_alunos];
        float soma = 0;
        for(int i = 0; i < qtd_alunos; i++){
            System.out.printf("Nota do %do aluno: ", i+1);
            notas[i] = sc.nextFloat();
            soma += notas[i];
        }
        float media = soma / qtd_alunos;
        System.out.println("Media: "+ media);
    }
}