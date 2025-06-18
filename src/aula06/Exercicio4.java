package aula06;

import java.util.Scanner;

/**
 * ID do exercício: XP1-06-04
 */
public class Exercicio4 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.print("Seu nome? ");
    String nome = leitor.nextLine();

    System.out.print("Mora em qual cidade? ");
    String cidade = leitor.nextLine();

    System.out.print("Qual a sua comida favorita? ");
    String comida = leitor.nextLine();

    System.out.printf("%s, de %s, provavelmente está com vontade de comer %s agora.", nome, cidade, comida);
  }
}
