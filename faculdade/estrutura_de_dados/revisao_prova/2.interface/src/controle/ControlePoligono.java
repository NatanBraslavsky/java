package controle;
import java.util.Scanner;

import modelo.Quadrado;
import modelo.Retangulo;

public class ControlePoligono{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecione uma opção: ");
        System.out.println("1-Quadrado\n2-Retângulo: ");
        int opcao = sc.nextInt();

        switch(opcao) {
            case 1:
                System.out.println("Lado: ");
                float lado = sc.nextFloat();
                Quadrado quad = new Quadrado(lado);
                System.out.println("Area: " + quad.calcularArea());
                break;

            case 2:
                System.out.println("Base: ");
                float base = sc.nextFloat();
                System.out.println("Altura: ");
                float altura = sc.nextFloat();
                Retangulo ret = new Retangulo(base,altura);
                System.out.println("Area: " + ret.calcularArea());
                break;
        }
    }
}
