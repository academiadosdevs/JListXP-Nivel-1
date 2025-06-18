package aula12;

/**
 * ID do exercício: XP1-12-16
 */
public class Exercicio16 {
  public static void main(String[] args) {
    System.out.println("Múltiplos de 7 entre 0 e 200:");
    for (int i = 0; i <= 200; i++) {
      if (i % 7 == 0) {
        System.out.println(i);
      }
    }
  }
}