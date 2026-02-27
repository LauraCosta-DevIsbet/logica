// Faça um programa que receba um número inteiro entre 1 e 12 e informe o mês correspondente (1 = janeiro, 2 = fevereiro),

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		 System.out.println("Digitque um número inteiro entre 1 e 12 para saber qual o mês que é:");
		 int diaSemana = input.nextInt();

		 switch (diaSemana) {
			 case 1:
				 System.out.println("O mês atual é Janeiro!");
				 break;
			 case 2:
				 System.out.println("O mês atual é Fevereiro!");
				 break;
			 case 3:
				 System.out.println("O mês atual é Março!");
				 break;
			 case 4:
				 System.out.println("O mês atual é Abril!");
				 break;
			 case 5:
				 System.out.println("O mês atual é Maio!");
				 break;
			 case 6:
				 System.out.println("O mês atual é Junho!");
				 break;
			 case 7:
				 System.out.println("O mês atual é Julho!");
				 break;
			 case 8:
				 System.out.println("O mês atual é Agosto!");
				 break;
			 case 9:
				 System.out.println("O mês atual é Setembro!");
				 break;
			 case 10:
				 System.out.println("O mês atual é Outubro!");
				 break;
			 case 11:
				 System.out.println("O mês atual é Novembro!");
				 break;
			 case 12:
				 System.out.println("O mês atual é Dezembro!");
				 break;
			 default:
				 System.out.println("Número inválido. Por favor, digite um número entre 1 e 12.");
		 }
		
		input.close();
	}
}