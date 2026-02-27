// Escreva um programa para ler 3 valores inteiros e escrever o maior deles. Considere que o usuário não informará valores iguais.


import java.util.Scanner;

public class Exercicio26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int num1 = input.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int num2 = input.nextInt();
		
		System.out.print("Digite o terceiro número: ");
		int num3 = input.nextInt();
		
		int maior = num1;
		if (num2 > maior) {
			maior = num2;
		}
		if (num3 > maior) {
			maior = num3;
		}
		
		System.out.println("O maior número é: " + maior);
		
		input.close();

	}
}