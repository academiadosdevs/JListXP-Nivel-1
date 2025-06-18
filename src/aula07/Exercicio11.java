package aula07;

import java.util.Scanner;

/**
 * ID do exercício: XP1-07-11
 */
public class Exercicio11 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.print("Digite um número para ver sua tabuada: ");
    int numero = leitor.nextInt();

    System.out.println("Tabuada do " + numero + ":");

    System.out.printf("%d x 1 = %d\n", numero, (numero * 1));
    System.out.printf("%d x 2 = %d\n", numero, (numero * 2));
    System.out.printf("%d x 3 = %d\n", numero, (numero * 3));
    System.out.printf("%d x 4 = %d\n", numero, (numero * 4));
    System.out.printf("%d x 5 = %d\n", numero, (numero * 5));
    System.out.printf("%d x 6 = %d\n", numero, (numero * 6));
    System.out.printf("%d x 7 = %d\n", numero, (numero * 7));
    System.out.printf("%d x 8 = %d\n", numero, (numero * 8));
    System.out.printf("%d x 9 = %d\n", numero, (numero * 9));
    System.out.printf("%d x 10 = %d\n", numero, (numero * 10));

    leitor.close();
  }
}