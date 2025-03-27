import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[6];
        for(int i = 0; i < 6; i++){
            System.out.print("Digite um valor: ");
            numeros[i] = sc.nextInt();
        }
        for(int i = 5; i > -1; i--){
            System.out.print(numeros[i]+" ");
        }
    }
}