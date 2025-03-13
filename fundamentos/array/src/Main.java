import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //maneira de adicionar elementos sem definir o tamanho
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Pedro");
        System.out.println(nomes.get(0));

        //loop for in carro
        String[] carro = {"ford", "ferrari", "pagani"};
        for (String i : carro) {
            System.out.println(i);
        }

        //maneira de definir o tamanho do array
        int[] notas = new int[10];
        for (int i : notas){
            notas[i]+=1;
            System.out.println(notas[i]);
        }
    }
}

