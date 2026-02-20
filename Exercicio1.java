// Escrever um programa que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão dos números lidos.

import java.util.Scanner; 

public class Exercicio1 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);   
		 
		 int x, y; // primeiro número e segundo número 
		 int soma, subt, mult; // operações
		 double div; 
		 
		 System.out.print("Digite o primeiro número:" );   
		 x = input.nextInt();   
		 System.out.print("Digite o segundo número:" );   
		 y = input.nextInt();   
		 
		 soma = x + y;
		 subt = x - y;
		 mult = x * y;
		 div = (double) x / y;

		 System.out.println("Resultados: " +
                   "\nSoma: " + soma +
                   "\nSubtração: " + subt +
                   "\nDivisão: " + div +
                   "\nMultiplicação: " + mult);

		 input.close();
	}
}