package aula07;

import java.util.Scanner;

/**
 * ID do exercício: XP1-07-14
 */
public class Exercicio14 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.print("Digite um número inteiro: ");
    int numero = leitor.nextInt();

    double quadrado = Math.pow(numero, 2);

    System.out.println("O quadrado de " + numero + " é: " + quadrado);

    leitor.close();
  }
}