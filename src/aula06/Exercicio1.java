package aula06;

import java.util.Scanner;

/**
 * ID do exercício: XP1-06-01
 */
public class Exercicio1 {
  public static void main(String[] args) {
    int numero;
    Scanner leitor = new Scanner(System.in);

    System.out.print("Digite um número: ");
    numero = leitor.nextInt();
    System.out.println("O número digitado foi: " + numero);
  }
}
