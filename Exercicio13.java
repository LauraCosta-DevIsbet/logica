/*
Uma empresa decidiu implementar um sistema de cálculo de gratificação mensal para seus colaboradores com base nas horas extras realizadas e nas horas de falta registradas durante o mês.

Para determinar o valor da gratificação, deve-se:

Ler o total de horas extras realizadas no mês.

Ler o total de horas-falta registradas no mês.

Calcular o valor de H, utilizando a seguinte fórmula:

H=horasExtras−(0,67×horasFaltas)

Converter o resultado de H para minutos:

minutos=H×60

De acordo com a quantidade de minutos obtida, determinar o valor da gratificação conforme a tabela abaixo:

| Minutos Calculados | Valor da Gratificação |
| ------------------ | --------------------- |
| Menor que 600      | R$ 100,00             |
| De 600 a 1200      | R$ 200,00             |
| De 1201 a 1800     | R$ 300,00             |
| De 1801 a 2400     | R$ 400,00             |
| Acima de 2400      | R$ 500,00             |

Desenvolva um programa em que leia as informações, realize os cálculos necessários e exiba na tela o valor correspondente da gratificação.

*/

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		 System.out.println("Digite o total de horas extras realizadas no mês: ");
		 double horasExtras = input.nextDouble();

		 System.out.println("Digite o total de horas-falta registradas no mês: ");
		 double horasFaltas = input.nextDouble();

		 double H = horasExtras - (0.67 * horasFaltas);
		 double minutos = H * 60;

		 if (minutos < 600) {
			 System.out.println("Valor da Gratificação: R$ 100,00");
		 } else if (minutos >= 600 && minutos <= 1200) {
			 System.out.println("Valor da Gratificação: R$ 200,00");
		 } else if (minutos > 1200 && minutos <= 1800) {
			 System.out.println("Valor da Gratificação: R$ 300,00");
		 } else if (minutos > 1800 && minutos <= 2400) {
			 System.out.println("Valor da Gratificação: R$ 400,00");
		 } else {
			 System.out.println("Valor da Gratificação: R$ 500,00");
		 }
		
		input.close();
	}
}