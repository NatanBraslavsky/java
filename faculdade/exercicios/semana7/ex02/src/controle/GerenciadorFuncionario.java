package controle;
import dominio.Funcionario;
import java.util.Scanner;

public class GerenciadorFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario func = new Funcionario();

        System.out.print("Digite o nome do Funcionário: ");
        func.nome = sc.nextLine();

        System.out.print("Digite o salário base do Funcionário: ");
        func.salarioBase = sc.nextDouble();
        sc.nextLine();

        System.out.print("Digite a Categoria do Funcionário: ");
        func.categoria = sc.nextLine();

        func.calcularSalarioFinal();
        sc.close();
    }

}
