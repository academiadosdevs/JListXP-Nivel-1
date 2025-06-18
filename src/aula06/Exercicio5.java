package aula06;

import java.util.Scanner;

/**
 * ID do exercício: XP1-06-05
 */
public class Exercicio5 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.print("N1 = ");
    String entrada = leitor.nextLine();
    int n1 = Integer.parseInt(entrada);

    System.out.print("N2 = ");
    entrada = leitor.nextLine();
    int n2 = Integer.parseInt(entrada);

    int resultado = n1 + n2;
    System.out.print("A doma dos números é: " + resultado);
  }
}
