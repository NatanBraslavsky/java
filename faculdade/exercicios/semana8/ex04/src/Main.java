import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[8];
        int qtdPar = 0;
        for(int i = 0; i < 8; i++){
            System.out.print("Digite um número: ");
            nums[i] = sc.nextInt();
            if (nums[i] % 2 == 0){
                qtdPar++;
            }
        }
        System.out.println("Quantidade de números pares no vetor: "+ qtdPar);
    }
}