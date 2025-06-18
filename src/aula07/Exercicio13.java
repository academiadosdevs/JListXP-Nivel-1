package aula07;

/**
 * ID do exercício: XP1-07-13
 */
public class Exercicio13 {
  public static void main(String[] args) {
    int valorNegativo = -7;
    int valorPositivo = Math.abs(valorNegativo);

    System.out.println("O valor original é: " + valorNegativo);
    System.out.println("O valor absoluto (positivo) é: " + valorPositivo);
  }
}