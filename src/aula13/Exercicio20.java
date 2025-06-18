package aula13;

/**
 * ID do exercício: XP1-13-20
 * (Observação: No PDF, o ID pode estar com o typo XP1-12-20)
 */
public class Exercicio20 {
  public static void main(String[] args) {
    String[] alunos = { "Lucas", "Leticia", "Roger", "Carla", "José" };
    int[] idades = { 25, 22, 28, 30, 21 };

    System.out.println("Lista de Alunos:");
    for (int i = 0; i < alunos.length; i++) {
      System.out.println("Nome: " + alunos[i] + " - Idade: " + idades[i]);
    }
  }
}