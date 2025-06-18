package aula07;

import java.util.Scanner;

/**
 * ID do exercicio: XP1-07-10
 */
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pede as horas de estudo para cada dia
        System.out.print("Quantas horas você estudou no primeiro dia? ");
        double dia1 = scanner.nextDouble();

        System.out.print("Quantas horas você estudou no segundo dia? ");
        double dia2 = scanner.nextDouble();

        System.out.print("Quantas horas você estudou no terceiro dia? ");
        double dia3 = scanner.nextDouble();

        // Calcula a média. Dividir por 3.0 garante uma divisão de ponto flutuante.
        double media = (dia1 + dia2 + dia3) / 3.0;

        // Exibe o resultado formatado com duas casas decimais
        System.out.printf("A sua média de estudo nos últimos 3 dias foi de %.2f horas por dia.\n", media);

        scanner.close();
    }
}