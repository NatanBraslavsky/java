package dominio;
import controle.Calculadora;

public class Calcular {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.somaDoisNumeros(3,5);
        System.out.println(soma);
    }
}
