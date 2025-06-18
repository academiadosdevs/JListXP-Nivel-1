package aula13;

/**
 * ID do exercício: XP1-13-05
 */
public class Exercicio5 {
  public static void main(String[] args) {
    int[] numeros = new int[10];
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = i + 1; // Preenche com 1 a 10
    }

    System.out.println("Valores de trás para frente:");
    for (int i = numeros.length - 1; i >= 0; i--) {
      System.out.print(numeros[i] + " ");
    }
  }
}