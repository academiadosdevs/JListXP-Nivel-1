package aula12;

/**
 * ID do exercício: XP1-12-24 (Solução Alternativa)
 */
public class Exercicio24 {
  public static void main(String[] args) {
    System.out.println("Alfabeto completo (usando ASCII):");

    // O laço 'for' itera sobre os códigos ASCII de 'A' (65) até 'Z' (90)
    for (int i = 65; i <= 90; i++) {
      // A conversão (char) i transforma o número na letra correspondente
      char letra = (char) i;
      System.out.print(letra + " ");
    }

    System.out.println(); // Pula uma linha no final
  }
}