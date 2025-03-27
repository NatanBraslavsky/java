import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[4];
        double media;
        double soma= 0;
        for(int i = 0; i < 4; i++){
            System.out.print("Digite a nota "+i+": ");
            notas[i] = sc.nextDouble();
            soma+=notas[i];
        }
        media = soma / 4;
        String situacao = media > 7 ? "Aprovado" : "Reprovado";
        System.out.print("Media: "+ media + " "+situacao);
    }
}