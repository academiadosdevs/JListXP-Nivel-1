package aula07;

import java.util.Scanner;

/**
 * ID do exercicio: XP1-07-09
 */
public class Exercicio9 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Pede ao usuário para digitar um número
    System.out.print("Digite um número inteiro: ");
    int numero = scanner.nextInt();

    // Exibe a sequência de números formatada
    System.out.printf("Saída: %d, %d, %d, %d, %d\n",
            numero - 2, numero - 1, numero, numero + 1, numero + 2);

    scanner.close();
  }
}