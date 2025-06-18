package aula07;

/**
 * ID do exercício: XP1-07-17
 */
public class Exercicio17 {
  public static void main(String[] args) {
    double valorComDesconto = 99.15;
    double valorArredondadoParaBaixo = Math.floor(valorComDesconto);

    System.out.println("Valor com desconto: " + valorComDesconto);
    System.out.println("Valor arredondado para baixo: " + valorArredondadoParaBaixo);
  }
}