package aula06;

import java.util.Scanner;

/**
 * ID do exercício: XP1-06-02
 */
public class Exercicio2 {
  public static void main(String[] args) {
    float numero;
    Scanner leitor = new Scanner(System.in);

    System.out.print("Digite um número: ");
    numero = leitor.nextFloat();
    System.out.printf("Você digitou o número: %.1f", numero);
  }
}
