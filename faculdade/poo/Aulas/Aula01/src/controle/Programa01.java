package controle;

import java.util.Scanner;

public class Programa01 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n1 = input.nextInt();
		System.out.println("Digite outro número");
		int n2 = input.nextInt();
		
		try {	
			System.out.println("A divisão é " + (n1 / n2));
		} catch (ArithmeticException e) {
			System.out.println("Não é possível dividir por zero!");
		}
		System.out.println("**** FIM DO PROGRAMA ****");
	}
}
