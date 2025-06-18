package aula13;

/**
 * ID do exercício: XP1-13-12
 */
public class Exercicio12 {
  public static void main(String[] args) {
    String[] nomes = { "Goku", "Vegeta", "Naruto", "Jason", "Bob Esponja" };

    System.out.println("Nomes com mais de 5 letras:");
    for (int i = 0; i < nomes.length; i++) {
      if (nomes[i].length() > 5) {
        System.out.println(nomes[i]);
      }
    }
  }
}