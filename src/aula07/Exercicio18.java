package aula07;

import java.util.Scanner;

/**
 * ID do exercício: XP1-07-18
 */
public class Exercicio18 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.print("Digite a primeira nota: ");
    double nota1 = leitor.nextDouble();

    System.out.print("Digite a segunda nota: ");
    double nota2 = leitor.nextDouble();

    double menorNota = Math.min(nota1, nota2);

    System.out.println("A menor nota digitada foi: " + menorNota);

    leitor.close();
  }
}