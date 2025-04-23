import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num = 1;
        while (num != 0){
            System.out.print("Digite um número (0 para sair): ");
            num = sc.nextInt();
            if(num != 0){
                nums.add(num);
            }
        }
        Collections.sort(nums);
        System.out.println(nums);
    }
}