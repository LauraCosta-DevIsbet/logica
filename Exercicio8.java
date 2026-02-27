/* As maçãs custam R$ 0,30 cada se forem compradas menos de uma dúzia e R$ 0,25 se forem compradas pelo menos doze. 
 * Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra. */


import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		 System.out.println("Quantas maçãs você comprou? ");
		 int qtdMacas = input.nextInt();

		 double precoMacas;
		 if (qtdMacas < 12) {
			 precoMacas = 0.30;
		 } else {
			 precoMacas = 0.25;
		 }

		 double custoTotal = qtdMacas * precoMacas;

		 System.out.println("O total das suas maçãs é: R$ " + custoTotal);

		input.close();
	}
}