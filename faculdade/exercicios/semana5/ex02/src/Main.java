import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite sua idade: ");
        int idade = sc.nextInt();
        if(idade < 18){
            System.out.printf("Menor de idade.");
        }
        else if(idade >= 18 && idade < 60){
            System.out.printf("Maior de idade.");
        }
        else{
            System.out.printf("Idoso.");
        }
    }
}