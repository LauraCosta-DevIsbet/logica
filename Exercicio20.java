/* Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poder� ou n�o votar este ano 
 * (não é necessário considerar o mês em que ela nasceu). */

import java.util.Scanner;

 public class Exercicio20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		System.out.println("Em qual ano você nasceu?");
		int anoNascimento = input.nextInt();
		
		int anoAtual = 2026;
		int idade = anoAtual - anoNascimento;
		
		if (idade >= 16) {
			System.out.println("Você pode votar este ano.");
		} else {
			System.out.println("Você não pode votar este ano, você é muito jovem.");
		}
		
		input.close();
	}
}