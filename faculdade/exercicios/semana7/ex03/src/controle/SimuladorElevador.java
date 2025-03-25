package controle;
import dominio.Elevador;
import java.util.Scanner;

public class SimuladorElevador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Elevador elevador = new Elevador();
        int opcao;
        do{
            do{
                System.out.print("Selecione uma opção:\n1- Subir Andar\n2- Descer Andar\n3- Exibir Andar\n4- Sair\nEscolha: ");
                opcao = sc.nextInt();
            } while(opcao < 1 || opcao > 3);
            switch (opcao){
                case 1:
                    elevador.subir();
                    break;
                case 2:
                    elevador.descer();
                    break;
                case 3:
                    elevador.exibirAndar();
                    break;
            }
        } while(opcao != 4);
    }
}
