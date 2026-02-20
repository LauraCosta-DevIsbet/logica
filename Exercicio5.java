// Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. 
// A fórmula de conversão é:  F= (9*C+160) / 5,  sendo F a temperatura em Fahrenheit e C a temperatura em Celsius. 

import java.util.Scanner; 

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Celsius:");
		double Celsius = input.nextDouble();

		double Fahrenheit = (9*Celsius) / 5;

		System.out.println("A temperatura em Fahrenheit:" + Fahrenheit);
		 
		 input.close();
	}
}
