import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++){
            System.out.println("Digite um numero: ");
            numeros.add(sc.nextInt());
        }
        for(int i = numeros.size()-1; i >= 0; i--){
            System.out.print(numeros.get(i) + " ");
        }
        sc.close();
    }
}


