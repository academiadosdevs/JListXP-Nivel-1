package aula12;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-12-21
 */
public class Exercicio21 {
  public static void main(String[] args) {
    // Pede as informações ao usuário
    String feitico = JOptionPane.showInputDialog("Digite o nome do feitiço:");
    String entradaVezes = JOptionPane.showInputDialog("Quantas vezes o feitiço será lançado?");
    int vezes = Integer.parseInt(entradaVezes);

    System.out.println("O mago se concentra...");
    
    // Usa um laço para repetir a exibição do feitiço
    for (int i = 1; i <= vezes; i++) {
      System.out.println("Lançando " + feitico + "! (" + i + "x)");
    }
    
    System.out.println("O feitiço foi completado!");
  }
}