import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um ano: ");
        int ano = sc.nextInt();
        boolean bissexto;
        if (ano % 4 == 0){
            if(ano % 100 == 0 && ano % 400 == 0){
                bissexto = true;
            }
            else if(ano % 100 != 0 && ano % 400 != 0){
                bissexto = true;
            }
            else{
                bissexto = false;
            }
        }
        else{
            bissexto = false;
        }
        if(bissexto){
            System.out.printf("%d é bissexto.", ano);
        }
        else{
            System.out.printf("%d não é bissexto.", ano);
        }
        sc.close();
    }
}
