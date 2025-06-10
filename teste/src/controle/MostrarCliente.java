package controle;
import dominio.Cliente;

public class MostrarCliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nome = "Natan";
        cliente.idade = 20;
        System.out.printf("\nNome: %s\nIdade: %d", cliente.nome, cliente.idade);
    }
}
