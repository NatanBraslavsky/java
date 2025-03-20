package controle;
import dominio.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Natan";
        pessoa.idade = 20;
        pessoa.altura = 1.95f;
        System.out.printf("Nome: %s Idade: %d Altura: %.2f", pessoa.nome, pessoa.idade, pessoa.altura);

    }
}