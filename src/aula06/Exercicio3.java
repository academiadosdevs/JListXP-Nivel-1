package aula06;

import java.util.Scanner;

/**
 * ID do exercício: XP1-06-03
 */
public class Exercicio3 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.print("Digite o nome: ");
    String nome = leitor.nextLine();

    System.out.print("Digite a sua idade: ");
    String idadeString = leitor.nextLine();
    int idade = Integer.parseInt(idadeString);

    System.out.print("Digite a sua profissão: ");
    String profissao = leitor.nextLine();

    System.out.printf("Nome: %s\nIdade: %d\nProfissão: %s", nome, idade, profissao);
  }
}
