package controle;
import java.util.Scanner;
import java.util.ArrayList;
import dominio.Capta;

public class Array{
    public static void main(String[] args) {
        Capta cap = new Capta();
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> idades = new ArrayList<>();
        for(int i = 0; i < 3;i++){
            System.out.print("Digite sua idade: ");
            int idade = sc.nextInt();
            idades.add(idade);
        }
        System.out.println(idades);
        String s = "feliz aniversario";
        String result = cap.Capitalize(s);
        System.out.println(result);
    }
}