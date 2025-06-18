package aula13;

import java.util.Random;

/**
 * ID do exercício: XP1-13-15
 */
public class Exercicio15 {
  public static void main(String[] args) {
    String[] personagens = { "Superman", "Batman", "Mulher-Maravilha", "Flash", "Aquaman",
        "Ciborgue", "Lanterna Verde", "Caçador de Marte", "Arqueiro Verde", "Canário Negro" };

    Random random = new Random();

    // Embaralha o array para garantir aleatoriedade sem repetição
    for (int i = 0; i < personagens.length; i++) {
      int indiceAleatorio = random.nextInt(personagens.length);
      // Troca o elemento atual com um elemento aleatório
      String temp = personagens[i];
      personagens[i] = personagens[indiceAleatorio];
      personagens[indiceAleatorio] = temp;
    }

    System.out.println("Seu time de 5 heróis sorteados é:");
    for (int i = 0; i < 5; i++) {
      System.out.println("- " + personagens[i]);
    }
  }
}