package aula07;

import java.util.Scanner;

/**
 * ID do exercicio: XP1-07-08
 */
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pede as informações da série
        System.out.print("Digite a quantidade de temporadas da série: ");
        int temporadas = scanner.nextInt();

        System.out.print("Digite a quantidade de episódios por temporada: ");
        int episodiosPorTemporada = scanner.nextInt();

        System.out.print("Digite a duração (em minutos) de cada episódio: ");
        int minutosPorEpisodio = scanner.nextInt();

        // Calcula o tempo total em minutos
        int tempoTotalMinutos = temporadas * episodiosPorTemporada * minutosPorEpisodio;

        // Exibe o resultado
        System.out.println("\nO tempo total gasto para maratonar a série foi de " + tempoTotalMinutos + " minutos.");

        scanner.close();
    }
}