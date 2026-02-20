// Escrever um programa que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. 
// No final informar o nome do aluno e a sua média (aritmética).

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		 System.out.print("Digite o nome do estudante:");
		 String nome = input.nextLine();

		 System.out.print("Digite a primeira nota:");
		 double nota1 = input.nextDouble();
		 System.out.print("Digite a segunda nota:");
		 double nota2 = input.nextDouble();
		 System.out.print("Digite a terceira nota:");
		 double nota3 = input.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
		System.out.println("O estudante " + nome + " obteve a média de: " + media);
		input.close();
	}
}
