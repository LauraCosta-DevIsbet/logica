// Escreva um programa para ler 2 valores (considere que não serão informados valores iguais) e escrever o maior deles.

import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		short a, b;
		
		System.out.println("Digite o primeiro número: ");
		a = input.nextShort();

		System.out.println("Digite o segundo número: ");
		b = input.nextShort();

		if (a > b) {
			System.out.println("O maior número é: " + a);
		} else {
			System.out.println("O maior número é: " + b);
		}
		
		input.close();
	}
}