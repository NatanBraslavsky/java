import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite um número inteiro: ");
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.printf("%d é par", num);
        }
        else{
            System.out.printf("%d é impar", num);
        }
    }
}