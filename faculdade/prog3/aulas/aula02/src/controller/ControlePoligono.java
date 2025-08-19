package controller;
import java.util.Scanner;
import model.*;

public class ControlePoligono {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o polígono que deseja calcular a área: \n1-Quadrado\n2-Retângulo\n3-Trapezio\n4-Triângulo\nOpção: ");
        int opcao = sc.nextInt();
        switch(opcao){
            case 1:
                System.out.println("Lado: ");
                Double lado = sc.nextDouble();
                Quadrado quadrado = new Quadrado(lado);
                System.out.printf("Área do quadrado: %.2f", quadrado.calcularArea());
                break;
            case 2:
                System.out.println("Base: ");
                Double base = sc.nextDouble();
                System.out.println("Altura: ");
                Double altura = sc.nextDouble();
                Retangulo retangulo = new Retangulo(base, altura);
                System.out.printf("Área do retângulo: %.2f", retangulo.calcularArea());
                break;
            case 3:
                System.out.println("Base maior: ");
                Double baseMaior = sc.nextDouble();
                System.out.println("Base menor: ");
                Double baseMenor = sc.nextDouble();
                System.out.println("Altura: ");
                Double alturaTrapezio = sc.nextDouble();
                Trapezio trapezio = new Trapezio(baseMaior, baseMenor, alturaTrapezio);
                System.out.printf("Área do trapézio: %.2f", trapezio.calcularArea());
                break;
            case 4:
                System.out.println("Base: ");
                Double baseTriangulo = sc.nextDouble();
                System.out.println("Altura: ");
                Double alturaTriangulo = sc.nextDouble();
                Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo);
                System.out.printf("Área do trapézio: %.2f", triangulo.calcularArea());
                break;
            default:
                System.out.println("Digite um número válido.");
        }
    }
}
