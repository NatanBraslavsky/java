package controle;
import dominio.Pessoa;
import java.util.Scanner;

public class CadastroPessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite o peso: ");
        double peso = sc.nextDouble();

        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();

        Pessoa pessoa = new Pessoa(id,nome,idade,peso,altura);
        pessoa.listarPessoa();
        System.out.printf("IMC: %.2f", pessoa.calcularIMC());
        sc.close();
    }
}
