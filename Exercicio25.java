/* Acrescente as seguintes mensagens à solução da tarefa 14 conforme o caso.
 * Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO.
 * Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO. */

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos lados tem o polígono? ");
        int lados = input.nextInt();

        if (lados < 3) {
            System.out.println("NÃO É UM POLÍGONO");
        } else {
            System.out.print("Qual a medida do lado em cm? ");
            double lado = input.nextDouble();
            double area;

            if (lados == 3) {
                area = (lado * lado * Math.sqrt(3)) / 4;
                System.out.println("TRIÂNGULO com área de " + area + " cm²");
            } else if (lados == 4) {
                area = lado * lado;
                System.out.println("QUADRADO com área de " + area + " cm²");
            } else if (lados == 5) {
                area = (5 * lado * lado) / (4 * Math.tan(Math.PI / 5));
                System.out.printf("PENTÁGONO com área de %.2f cm²%n", area);
            } else {
                System.out.println("POLÍGONO NÃO IDENTIFICADO");
            }
        }

        input.close();
    }
}