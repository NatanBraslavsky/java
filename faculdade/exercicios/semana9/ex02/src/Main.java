import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<Double>();
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        for(int i = 0; i < 4; i++){
            System.out.println("Digite uma nota: ");
            double nota = sc.nextDouble();
            notas.add(nota);
            soma+=nota;
        }
        double media = soma / notas.size();
        System.out.printf("Media: %.2f", media);
    }
}