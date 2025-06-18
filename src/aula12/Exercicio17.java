package aula12;

import java.util.Scanner;

/**
 * ID do exercício: XP1-12-17
 */
public class Exercicio17 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Número inicial: ");
    int inicial = scanner.nextInt();

    System.out.print("Número final: ");
    int finalNum = scanner.nextInt();

    System.out.print("Incremento: ");
    int incremento = scanner.nextInt();

    for (int i = inicial; i <= finalNum; i += incremento) {
      System.out.println(i);
    }
    scanner.close();
  }
}