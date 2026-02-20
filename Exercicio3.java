// Escreva um programa que entre com um número e o imprima caso seja maior do que 20. 

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número:");
		double x = input.nextDouble();

		if (x > 20) {
			System.out.println("O número é: " + x);
		} else {
			System.out.println("O número é menor ou igual a 20.");
		}

		input.close();
	}
}