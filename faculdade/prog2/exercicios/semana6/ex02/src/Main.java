import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        for(int i = 0; i <= numero; i++){
            System.out.printf("%d * %d = %d\n", numero, i, numero*i);
        }
    }
}