package aula13;

/**
 * ID do exercício: XP1-13-02
 */
public class Exercicio2 {
  public static void main(String[] args) {
    int[] numeros = { 7, 13, 21, 42, 99 };

    for (int i = 0; i < numeros.length; i++) {
      System.out.print(numeros[i]);
      if (i < numeros.length - 1) {
        System.out.print(", ");
      }
    }
  }
}