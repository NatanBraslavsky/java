import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um valor: ");
            valores[i] = sc.nextInt();
        }

        System.out.print("Digite um número para buscar no array: ");
        int busca = sc.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < 10; i++) {
            if (busca == valores[i]) {
                System.out.println("Valor encontrado na posição: " + i);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Não encontrado");
        }

        sc.close();
    }
}
