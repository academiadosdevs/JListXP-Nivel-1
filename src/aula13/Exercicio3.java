package aula13;

/**
 * ID do exercício: XP1-13-03
 */
public class Exercicio3 {
  public static void main(String[] args) {
    String[] nomes = { "Ana", "Bruno", "Carlos", "Daniela", "Eduardo" };

    System.out.println("Nomes com índice par:");
    for (int i = 0; i < nomes.length; i++) {
      if (i % 2 == 0) {
        System.out.println(nomes[i]);
      }
    }
  }
}