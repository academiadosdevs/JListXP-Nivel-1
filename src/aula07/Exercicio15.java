package aula07;

import java.util.Scanner;

/**
 * ID do exercício: XP1-07-15
 */
public class Exercicio15 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.print("Digite um número para calcular a raiz quadrada: ");
    double numero = leitor.nextDouble();

    double raizQuadrada = Math.sqrt(numero);

    System.out.printf("A raiz quadrada de %.2f é: %.2f\n", numero, raizQuadrada);

    leitor.close();
  }
}