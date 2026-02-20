//Escrever um programa para determinar o consumo médio de um automóvel, 
//sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto. 

import  java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double ConsumoMedio;
		double kmi; // distância inicial
		double kmf; //distância final
		double litros;
		double kmtotal;

		System.out.print("Digite a distância inicial:");
		kmi = input.nextDouble();
		System.out.print("Digite a distância final:");
		kmf = input.nextDouble();

		System.out.print("Digite o combustível gasto em litros:");
		litros = input.nextDouble();

		kmtotal = kmf - kmi;
		ConsumoMedio = kmtotal / litros;

		System.out.printf("O consumo médio do automóvel é: %.2f km/l\n", ConsumoMedio);

		input.close();
	}
}
