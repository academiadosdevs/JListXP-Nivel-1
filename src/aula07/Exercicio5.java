package aula07;

import java.util.Scanner;

/**
 * ID do exercício: XP1-07-05
 */
public class Exercicio5 {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite um número inteiro: ");
      int numero = scanner.nextInt();

      int dobro = numero * 2;
      int triplo = numero * 3;

      System.out.println("Número digitado: " + numero);
      System.out.println("Dobro: " + dobro);
      System.out.println("Triplo: " + triplo);
  }
}
