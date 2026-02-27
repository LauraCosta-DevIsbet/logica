// Criar um programa que leia pelo teclado um valor inteiro e diga se é par ou ímpar.

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		 System.out.println("Digite um número inteiro: ");
		 int numero = input.nextInt();

		 if (numero % 2 == 0) {
			 System.out.println("O número " + numero + " é par.");
		 } else {
			 System.out.println("O número " + numero + " é ímpar.");
		 }
		
		input.close();
	}
}