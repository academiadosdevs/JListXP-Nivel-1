package aula12;

/**
 * ID do exercício: XP1-12-15
 */
public class Exercicio15 {
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      System.out.println("--- Tabuada do " + i + " ---");
      for (int j = 1; j <= 10; j++) {
        System.out.printf("%d x %d = %d\n", i, j, (i * j));
      }
      System.out.println(); // Linha em branco para separar as tabuadas
    }
  }
}