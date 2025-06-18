package aula07;

/**
 * ID do exercício: XP1-07-12
 */
public class Exercicio12 {
  public static void main(String[] args) {
    int resultadoSemParenteses = 10 + 20 * 3;
    int resultadoComParenteses = (10 + 20) * 3;

    System.out.println("Resultado sem parênteses (10 + 20 * 3): " + resultadoSemParenteses);
    System.out.println("Resultado com parênteses ((10 + 20) * 3): " + resultadoComParenteses);
  }
}