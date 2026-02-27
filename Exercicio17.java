/* Faça um programa que leia um conjunto não determinado de valores e mostre o valor lido, seu quadrado, seu cubo e sua raiz quadrada. 
 * Finalize a entrada de dados com um valor negativo ou zero. */

import java.util.Scanner;
import java.lang.Math;

public class Exercicio17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		double quadrado, cubo, raiz;
		
		System.out.print("Digite um número maior do que 0: ");
		num = input.nextInt();
		
		quadrado = Math.pow(num, 2);
		cubo = Math.pow(num, 3);
		raiz = Math.sqrt(num);
		
		System.out.println("Valor lido: " + num);
        System.out.println("Quadrado: " + quadrado);
        System.out.println("Cubo: " + cubo);
        System.out.printf("Raiz quadrada: %.2f%n", raiz);
			
		input.close();
	}
}