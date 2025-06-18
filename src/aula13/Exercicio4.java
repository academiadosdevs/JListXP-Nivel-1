package aula13;

import java.util.Arrays;

/**
 * ID do exercício: XP1-13-04
 */
public class Exercicio4 {
  public static void main(String[] args) {
    int[] numeros = new int[10];

    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = 7;
    }

    // A função Arrays.toString() é um atalho para exibir arrays
    System.out.println(Arrays.toString(numeros));
  }
}