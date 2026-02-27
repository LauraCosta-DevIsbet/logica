/* Escreva um programa para ler a altura, peso e gênero para calcular o IMC.
*/

import java.util.Scanner;

public class Exercicio24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int genero;
        double altura, peso;

        System.out.print("Digite o sexo (1 - feminino, 2 - masculino): ");
        genero = input.nextInt();

        System.out.print("Digite a altura em cm: ");
        altura = input.nextDouble();

        System.out.print("Digite o peso (em kg): ");
        peso = input.nextDouble();

        String descricaoGenero = "";
        if (genero == 1) {
            descricaoGenero = "Feminino";
        } else if (genero == 2) {
            descricaoGenero = "Masculino";
        } else {
            descricaoGenero = "Não identificado";
        }

        altura = altura / 100;
        double imc = peso / (altura * altura);

        System.out.println("\nGênero: " + descricaoGenero);
        System.out.printf("IMC: %.2f\n", imc);

        String classificacao;

        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 25) {
            classificacao = "Peso normal";
        } else if (imc < 30) {
            classificacao = "Sobrepeso";
        } else if (imc < 35) {
            classificacao = "Obesidade grau I";
        } else if (imc < 40) {
            classificacao = "Obesidade grau II";
        } else {
            classificacao = "Obesidade grau III";
        }

        System.out.println("Classificação: " + classificacao);

        double pesoIdeal = 22 * (altura * altura);

        if (imc >= 18.5 && imc < 25) {
            System.out.println("Você está no peso ideal.");
        } else {
            System.out.printf("Peso ideal aproximado: %.2f kg\n", pesoIdeal);

            double diferenca = peso - pesoIdeal;

            if (diferenca > 0) {
                System.out.printf("Você precisa perder aproximadamente %.2f kg.\n", diferenca);
            } else {
                System.out.printf("Você precisa ganhar aproximadamente %.2f kg.\n", Math.abs(diferenca));
            }
        }

		input.close();
	}
}