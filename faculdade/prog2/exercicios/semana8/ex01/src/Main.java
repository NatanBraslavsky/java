import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lista = new int[5];
        int maior = 0;
        int menor = 0;
        for(int i = 0; i < 5; i++){
            System.out.print("Digite um valor: ");
            lista[i] = sc.nextInt();
            if(lista[i] > maior){
                maior = lista[i];
            }
            if(lista[i] < menor || i == 0){
                menor = lista[i];
            }
        }
        System.out.printf("Maior: %d, Menor: %d.", maior, menor);
    }
}