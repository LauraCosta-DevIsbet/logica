// Fibonacci. Alguns números desta sequência são: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...

import java.util.Scanner;

public class Exercicio31 {    
	public static int fibonacci (int numero){
        if(numero == 0) return 1;
		if(numero == 1) return 2;
        return fibonacci(numero-1) + fibonacci(numero-2);
    }
    
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		System.out.print("Informe um termo para saber a sua posição na sequencia Fibonacci: ");
		int num = input.nextInt();
		
		System.out.println("O " + num + "º termo da sequência Fibonacci é: "+ fibonacci(num));
		
		input.close();
	}
}