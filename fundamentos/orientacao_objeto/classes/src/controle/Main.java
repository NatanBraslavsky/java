package controle;
import dominio.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Natan", 20, 1.80f);
        System.out.println("Nome: "+ pessoa.nome);
        System.out.println("idade: " + pessoa.idade);
        System.out.printf("Altura: %.2f", pessoa.altura);
    }
}