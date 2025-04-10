import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Numero randomico
        /*Random rand = new Random();
        int[] nums = new int[10];

        for(int i = 0; i < 100; i++){
            int numero = rand.nextInt(10)+1;
            nums[numero-1]++;
        }

        for(int i = 0; i < 10; i++){
            System.out.printf("O numero %d apareceu %d vezes.\n", i+1, nums[i]);
        }*/


        //Pedra Papel Tesoura

        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int escolha_computador = random.nextInt(3)+1;

        System.out.println("Escolha entre:\n1 - Pedra\n2 - Papel\n3 - Tesoura\nEscolha: ");
        int escolha_usuario = sc.nextInt();

        String[] escolha_texto = {"Pedra", "Papel", "Tesoura"};

        String resultado = "";

        if (escolha_usuario == escolha_computador){
            resultado = "Empate.";
        }
        else if ((escolha_usuario == 1 && escolha_computador == 2) || (escolha_usuario == 2 && escolha_computador == 3) || (escolha_usuario == 3 && escolha_computador == 1)){
            resultado = "Computador venceu.";
        }
        else{
            resultado = "Você venceu.";
        }
        System.out.printf("Você escolheu '%s' e o computador escolheu '%s'.\nOu seja, %s", escolha_texto[escolha_usuario-1], escolha_texto[escolha_computador-1], resultado);
    }
}