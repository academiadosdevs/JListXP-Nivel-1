package aula13;

/**
 * ID do exercício: XP1-13-13
 */
public class Exercicio13 {
  public static void main(String[] args) {
    int[] numeros = new int[7];
    int maior = 0;

    System.out.println("Valores gerados:");
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = 1 + (int) (Math.random() * 100);
      System.out.print(numeros[i] + " ");
      if (numeros[i] > maior) {
        maior = numeros[i];
      }
    }

    System.out.println("\n\nO maior número é: " + maior);
  }
}