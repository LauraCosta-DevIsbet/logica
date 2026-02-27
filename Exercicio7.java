// Faça um programa que receba um valor que foi depositado e exiba o valor com rendimento após um mês. 
// Considere fixo o juro da poupança em 0.70% a. m.

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in); 
		 
		 System.out.print("Deposite o valor desejado:");
		 double valorDepositado = input.nextDouble();
		 
		 double juroMes = 0.007;

		 double valorPorMes = valorDepositado + (valorDepositado * juroMes);

		 System.out.println("O valor com rendimento após um mês é: R$ " + valorPorMes);

		input.close();
	}
}