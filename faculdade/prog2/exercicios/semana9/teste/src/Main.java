import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> idade = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            System.out.println("Digite: ");
            int x = sc.nextInt();
            idade.add(x);
        }
        for(int i = 0; i < 3; i++){
            System.out.println(idade.get(i));
        }
    }
}
