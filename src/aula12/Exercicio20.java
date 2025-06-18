package aula12;

/**
 * ID do exercício: XP1-12-20
 */
public class Exercicio20 {
  public static void main(String[] args) {
    for (int i = 1; i <= 20; i++) {
      System.out.print("Nível " + i + "!");
      if (i % 5 == 0) {
        System.out.print(" -> Aprendeu uma nova habilidade!");
      }
      System.out.println();
    }
  }
}