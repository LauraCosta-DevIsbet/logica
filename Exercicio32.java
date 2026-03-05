// Crie uma função recursiva que receba um número inteiro positivo N e calcule o somatório dos números de 1 a N.

import java.util.Scanner;

public class Exercicio32 {
    public static int somar (int numero){
        if(numero == 0) return 0;
        return numero+somar(numero-1);
    }
    
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		System.out.print("Informe um número: ");
		int num = input.nextInt();
		
		System.out.println("O somatório de 1 a " + num + somar(num));
		
		input.close();
	}
}