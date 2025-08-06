import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        do{
            System.out.print(num + (num == 0 ? " Fim" : ", "));
            num--;
        } while(num != -1);
    }
}