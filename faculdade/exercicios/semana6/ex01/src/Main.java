import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        int soma = 0;

        System.out.print("A soma entre: ");
        for (int i = 1; i <= num; i++) {
            soma += i;
            System.out.print(i + (i < num ? " + " : " = "));
        }

        System.out.println(soma);
    }
}