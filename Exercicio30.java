// Faça uma função recursiva que calcule e retorne o fatorial de um número inteiro N.

import java.util.Scanner;

public class Exercicio30 {
    
    public static long fatorial(int numero) {
        
        if (numero <= 1) {
            return 1;
        }
        
        return (long) numero * fatorial(numero - 1);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.print("Informe um número inteiro (N >= 0): ");
        int num = input.nextInt();
        
        
        if (num < 0) {
            System.out.println("Erro: Não existe fatorial de um número negativo.");
        } else {
            
            System.out.println("O fatorial de " + num + " é: " + fatorial(num));
        }
        
        input.close();
    }
}