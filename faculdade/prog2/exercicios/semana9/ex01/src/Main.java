import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        int maior = 0;
        int menor = 0;

        for(int i = 0; i < 5; i++){
            System.out.print("Digite um número: ");
            nums[i] = sc.nextInt();
            if (nums[i] > maior) {
                maior = nums[i];
            }
            if(nums[i] < menor || i == 0){
                menor = nums[i];
            }
        }
        System.out.printf("\nMaior: %d\nMenor:%d",maior,menor);
    }
}
