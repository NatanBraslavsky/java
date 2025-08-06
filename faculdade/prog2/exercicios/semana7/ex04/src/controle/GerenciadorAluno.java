package controle;
import java.util.Scanner;
import dominio.Aluno;

public class GerenciadorAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        do{
            System.out.print("Seu nome: ");
            aluno.nome = sc.nextLine();

            System.out.print("Sua nota: ");
            aluno.nota = sc.nextDouble();
            sc.nextLine();

            if(aluno.nota < 0 || aluno.nota > 10){
                System.out.print("Nota invalida. ");
            }

        }while(!aluno.validarNota());
        String classificacao = aluno.classificarAluno();
        System.out.println(classificacao);
    }
}
