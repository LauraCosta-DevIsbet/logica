/*
 Escreva um programa para ler o número de lados de um polígono regular e a medida do lado (em cm).
 * Calcular e imprimir o seguinte:
 * Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da área.
 * Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.
 * Se o número de lados for igual a 5 escrever PENTÁGONO. 
*/

import java.util.Scanner;

public class Exercicio23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantos lados tem o polígono? ");
		int lados = input.nextInt();
		
		System.out.print("Qual a medida do lado em cm? ");
		double lado = input.nextDouble();
		
		double area = 0;
		
		if (lados == 3) {
			area = (lado * lado * Math.sqrt(3)) / 4;
			System.out.println("TRIÂNGULO com área de " + area + " cm²");
		} else if (lados == 4) {
			area = lado * lado;
			System.out.println("QUADRADO com área de " + area + " cm²");
		} else if (lados == 5) {
			area = (5 * lado * lado) / (4 * Math.tan(Math.PI / 5));
			System.out.printf("PENTÁGONO com área de %.2f cm²%n", area);
		} else {
			System.out.println("Polígono não reconhecido.");
		}
		
		input.close();
	}
}