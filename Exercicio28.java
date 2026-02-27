/* Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva se o triângulo é Acutângulo, Retângulo ou Obtusângulo.
* Triângulo Retângulo: possui um ângulo reto. (igual a 90º)
* Triângulo Obtusângulo: possui um ângulo obtuso. (maior que90º)
* Triângulo Acutângulo: possui três ângulos agudos. (menor que 90º) */

import java.util.Scanner;

public class Exercicio28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro ângulo em graus: ");
        int ang1 = input.nextInt();
        System.out.print("Digite o segundo ângulo em graus: ");
        int ang2 = input.nextInt();
        System.out.print("Digite o terceiro ângulo em graus: ");
        int ang3 = input.nextInt();

        int soma = ang1 + ang2 + ang3;

        if (soma != 180) {
            System.out.println("Os ângulos fornecidos não formam um triângulo.");
        } else if (ang1 == 90 || ang2 == 90 || ang3 == 90) {
            System.out.println("Triângulo Retângulo");
        } else if (ang1 > 90 || ang2 > 90 || ang3 > 90) {
            System.out.println("Triângulo Obtusângulo");
        } else {
            System.out.println("Triângulo Acutângulo");
        }
		
		input.close();
	}
}