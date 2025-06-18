package aula13;

/**
 * ID do exercício: XP1-13-28
 */
public class Exercicio28 {
  public static void main(String[] args) {
    String[] jogos = { "The Witcher 3", "Cyberpunk 2077", "Super Mario World", "Stardew Valley", "Tony Hawks Pro Skater 2" };
    int[] horasJogadas = { 3, 0, 2, 500, 400 };
    int totalHoras = 0;

    for (int i = 0; i < horasJogadas.length; i++) {
      totalHoras += horasJogadas[i];
    }

    System.out.println("Total de horas jogadas: " + totalHoras);
  }
}