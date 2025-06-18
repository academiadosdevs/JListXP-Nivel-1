package aula07;

import java.util.Scanner;

/**
 * ID do exercicio: XP1-07-06
 */
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pede ao usuário para digitar os dois números
        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int n2 = scanner.nextInt();

        // Calcula os resultados
        int soma = n1 + n2;
        int subtracao = n1 - n2;
        int multiplicacao = n1 * n2;

        // Exibe os resultados formatados conforme o exemplo
        System.out.println("\nResultados:");
        System.out.printf("%d + %d = %d\n", n1, n2, soma);
        System.out.printf("%d - %d = %d\n", n1, n2, subtracao);
        System.out.printf("%d * %d = %d\n", n1, n2, multiplicacao);

        scanner.close();
    }
}