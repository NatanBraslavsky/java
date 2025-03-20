import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num1 = sc.nextInt();
        System.out.print("Digite outro número inteiro: ");
        int num2 = sc.nextInt();
        for(int i = num1; i <= num2; i++){
            boolean primo = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    primo = false;
                    break;
                }
            }
            if(primo){
                System.out.printf("%d ", i);
            }
        }
        sc.close();
    }
}
