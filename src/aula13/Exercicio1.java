package aula13;

/**
 * ID do exercício: XP1-13-01
 */
public class Exercicio1 {
  public static void main(String[] args) {
    String[] personagens = new String[3];
    personagens[0] = "Goku";
    personagens[1] = "Luffy";
    personagens[2] = "Naruto";

    System.out.println("Meus personagens favoritos:");
    for (int i = 0; i < personagens.length; i++) {
      System.out.println(personagens[i]);
    }
  }
}