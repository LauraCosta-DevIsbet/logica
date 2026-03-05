import java.util.Scanner;
import java.util.Locale;

public class Exercicio18 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        int codigo, horasTrabalhadas;
        int qtdeFuncionarios = 10;
        char turno, categoria;
        double valorHora = 0, salarioInicial, auxilioAlimentacao, salarioFinal;
        double salarioMinimo = 450.00;

        for (int i = 1; i <= qtdeFuncionarios; i++) {
            System.out.println("\n--- Cadastro do Funcionário " + i + " ---");

            System.out.print("Insira o código do funcionário: ");
            codigo = input.nextInt();

            System.out.print("Insira o número de horas trabalhadas: ");
            horasTrabalhadas = input.nextInt();

            // Validação do Turno (M, V ou N)
            do {
                System.out.print("Turno (M - Matutino, V - Vespertino ou N - Noturno): ");
                // Lemos a string, transformamos em Maiúscula e pegamos o primeiro caractere
                turno = input.next().toUpperCase().charAt(0);
                
                if (turno != 'M' && turno != 'V' && turno != 'N') {
                    System.out.println("Erro: Turno inválido! Digite apenas M, V ou N.");
                }
            } while (turno != 'M' && turno != 'V' && turno != 'N');

            // Validação da Categoria (O ou G)
            do {
                System.out.print("Categoria (O - Operário ou G - Gerente): ");
                categoria = input.next().toUpperCase().charAt(0);
                
                if (categoria != 'G' && categoria != 'O') {
                    System.out.println("Erro: Categoria inválida! Digite apenas O ou G.");
                }
            } while (categoria != 'G' && categoria != 'O');

            // b) Cálculo do valor da hora trabalhada
            if (categoria == 'G') {
                if (turno == 'N') {
                    valorHora = salarioMinimo * 0.18;
                } else { // M ou V
                    valorHora = salarioMinimo * 0.15;
                }
            } else { // categoria == 'O'
                if (turno == 'N') {
                    valorHora = salarioMinimo * 0.13;
                } else { // M ou V
                    valorHora = salarioMinimo * 0.10;
                }
            }

            // c) Cálculo do salário inicial
            salarioInicial = horasTrabalhadas * valorHora;

            // d) Cálculo do auxílio-alimentação
            if (salarioInicial <= 300) {
                auxilioAlimentacao = salarioInicial * 0.20;
            } else if (salarioInicial <= 600) {
                auxilioAlimentacao = salarioInicial * 0.15;
            } else {
                auxilioAlimentacao = salarioInicial * 0.05;
            }

            // e) Cálculo do salário final
            salarioFinal = salarioInicial + auxilioAlimentacao;

            // Exibição dos dados formatados
            System.out.println("\n--- RESULTADO DA FOLHA ---");
            System.out.println("Código: " + codigo);
            System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
            System.out.printf("Valor da Hora: R$ %.2f\n", valorHora);
            System.out.printf("Salário Inicial: R$ %.2f\n", salarioInicial);
            System.out.printf("Auxílio-Alimentação: R$ %.2f\n", auxilioAlimentacao);
            System.out.printf("Salário Final: R$ %.2f\n", salarioFinal);
            System.out.println("--------------------------");
        }

        input.close();
    }
}