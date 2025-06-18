package aula07;

import java.util.Scanner;

/**
 * ID do exercício: XP1-07-19
 */
public class Exercicio19 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.print("Digite a primeira nota: ");
    double nota1 = leitor.nextDouble();

    System.out.print("Digite a segunda nota: ");
    double nota2 = leitor.nextDouble();

    System.out.print("Digite a terceira nota: ");
    double nota3 = leitor.nextDouble();

    System.out.print("Digite a quarta nota: ");
    double nota4 = leitor.nextDouble();

    // Encontra o maior entre os dois primeiros
    double maiorParcial1 = Math.max(nota1, nota2);
    // Encontra o maior entre os dois últimos
    double maiorParcial2 = Math.max(nota3, nota4);
    // Encontra o maior entre os resultados parciais
    double maiorNotaFinal = Math.max(maiorParcial1, maiorParcial2);


    System.out.println("A maior nota digitada foi: " + maiorNotaFinal);

    leitor.close();
  }
}