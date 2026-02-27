// Faça um programa que receba um número inteiro entre 1 e 7 e informe o dia da semana correspondente (1 = domingo, 2 = segunda).

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		 System.out.println("Digitque um número inteiro entre 1 e 7 para saber qual o dia da semana é:");
		 int diaSemana = input.nextInt();

		 switch (diaSemana) {
			 case 1:
				 System.out.println("Hoje é Domingo!");
				 break;
			 case 2:
				 System.out.println("Hoje é Segunda-feira!");
				 break;
			 case 3:
				 System.out.println("Hoje é Terça-feira!");
				 break;
			 case 4:
				 System.out.println("Hoje é Quarta-feira!");
				 break;
			 case 5:
				 System.out.println("Hoje é Quinta-feira!");
				 break;
			 case 6:
				 System.out.println("Hoje é Sexta-feira!");
				 break;
			 case 7:
				 System.out.println("Hoje é Sábado!");
				 break;
			 default:
				 System.out.println("Número inválido. Por favor, digite um número entre 1 e 7.");
		 }
				
		input.close();
	}
}