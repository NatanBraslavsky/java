import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        while(true){
            System.out.printf("Digite seu nome: ");
            String nome = sc.next();

            if(nome.equals("a")){
                break;
            }
            nomes.add(nome);
        }
        System.out.printf("Array: %s", nomes);
    }
}
