package aula13;

import java.util.Arrays;

/**
 * ID do exercício: XP1-13-29
 */
public class Exercicio29 {
  public static void main(String[] args) {
    int[] vetorA = { 11, 13, 45, 7 };
    int[] vetorB = { 24, 4, 16, 81, 10, 12 };

    int[] uniao = new int[vetorA.length + vetorB.length];

    // Copia os elementos de vetorA para o início de uniao
    for (int i = 0; i < vetorA.length; i++) {
      uniao[i] = vetorA[i];
    }

    // Copia os elementos de vetorB para o restante de uniao
    for (int i = 0; i < vetorB.length; i++) {
      uniao[vetorA.length + i] = vetorB[i];
    }

    System.out.println("União: " + Arrays.toString(uniao));
  }
}