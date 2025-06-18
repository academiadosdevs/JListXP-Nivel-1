package aula12;

import java.util.Scanner;

/**
 * ID do exercício: XP1-12-19
 */
public class Exercicio19 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Caractere: ");
    String caractere = scanner.next();

    System.out.print("Altura da escada: ");
    int altura = scanner.nextInt();

    for (int i = 1; i <= altura; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(caractere);
      }
      System.out.println();
    }
    scanner.close();
  }
}