// Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). 
// O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário.

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		 System.out.print("Digite a cotação do dólar: ");
		 double cotaDolar = input.nextDouble();

		 System.out.print("Digite quantos dólares você tem: ");
		 double qtdDolares = input.nextDouble();

		 double valorConvertido = qtdDolares * cotaDolar;

		 System.out.println("Você tem o seguinte valor em reais: R$ " + valorConvertido);

		 input.close();
	}
}
