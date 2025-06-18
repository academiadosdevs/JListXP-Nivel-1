package aula06;

import java.util.Scanner;

/**
 * ID do exercício: XP1-06-06
 */
public class Exercicio6 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.print("Nome: ");
    String nome = leitor.nextLine();
    System.out.print("Classe (Mago, Guerreiro ou Arqueiro): ");
    String classe = leitor.nextLine();
    System.out.print("Nível: ");
    int nivel = leitor.nextInt();

    System.out.printf("%s, da classe %s, alcançou o nível %d!", nome, classe, nivel);
  }
}
