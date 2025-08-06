import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite sua nota: ");
        float nota = sc.nextFloat();
        String conceito = "";
        switch ((int) nota){
            case 0, 1, 2:
                conceito = "E";
                break;

            case 3, 4:
                conceito = "D";
                break;

            case 5, 6:
                conceito = "C";
                break;

            case 7, 8:
                conceito = "B";
                break;

            case 9, 10:
                conceito = "A";
                break;

            default:
                System.out.println("Nota inválida.");
        }
        System.out.println(conceito);
        sc.close();
    }
}
